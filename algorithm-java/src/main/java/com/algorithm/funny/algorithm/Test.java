package com.algorithm.funny.algorithm;

/**
 * @author clx 2018/2/1.
 */
public class Test {

	private static final long MAX_OPTIMIZED_LONG = 0x0fffffffffffffffL;
	private static final long MIN_OPTIMIZED_LONG = 0xF000000000000000L;
	private static final int MAX_OPTIMIZED_INT = 536870911;
	private static final int MIN_OPTIMIZED_INT = -536870912;

	/**
	 * 以可变字节长度书写long值。该值取值范围在[0xF000000000000000L,0x0fffffffffffffffL]之间
	 *
	 * @param writeBuffer
	 * @param pos
	 * @param v
	 * @return 写入字节数
	 */
	public static int writeOptimizedLong(byte[] writeBuffer, int pos, long v) {
		if (v > MAX_OPTIMIZED_LONG || v < MIN_OPTIMIZED_LONG) {
			throw new NumberFormatException(v + " out range of  Optimized long [ " + MIN_OPTIMIZED_LONG + ","
					+ MAX_OPTIMIZED_LONG + "]");
		}
		if (v >= 0) {
			int i = 7;
			while (i >= 0 && ((v >>> (i * 8)) & 0xFF) == 0) {
				i--;
			}
			int idx = pos;
			if (i < 0) {
				writeBuffer[pos] = 0;
				return 1;
			} else {
				int c = i;
				if (((v >>> (i * 8)) & 0xF0) != 0) {
					writeBuffer[pos] = 0;
					idx = pos + 1;
					c = i + 1;
				}
				for (int j = 0; j <= i; j++) {
					writeBuffer[idx + j] = (byte) (v >>> ((i - j) * 8));
				}
				writeBuffer[pos] |= (byte) (c << 5);
				return c + 1;
			}
		} else {
			v = ~v;
			int c = writeOptimizedLong(writeBuffer, pos, v);
			writeBuffer[pos] = (byte) (writeBuffer[pos] | 0x10);
			return c;
		}
	}

	/**
	 * 以可变字节长度书写int值。该值取值范围在[-536870912,536870911]之间
	 * 
	 * @param writeBuffer
	 * @param pos
	 * @param v
	 * @return
	 */
	public static int writeOptimizedInt(byte[] writeBuffer, int pos, int v) {
		if (v > MAX_OPTIMIZED_INT || v < MIN_OPTIMIZED_INT) {
			throw new NumberFormatException(v + " out range of  Optimized int [ " + MIN_OPTIMIZED_INT + ","
					+ MAX_OPTIMIZED_INT + "]");
		}
		if (v >= 0) {
			int i = 3;
			while (i >= 0 && ((v >>> (i * 8)) & 0xFF) == 0) {
				i--;
			}
			int idx = pos;
			if (i < 0) {
				writeBuffer[pos] = 0;
				return 1;
			} else {
				int c = i;
				if (((v >>> (i * 8)) & 0xE0) != 0) {
					writeBuffer[pos] = 0;
					idx = pos + 1;
					c = i + 1;
				}
				for (int j = 0; j <= i; j++) {
					writeBuffer[idx + j] = (byte) (v >>> ((i - j) * 8));
				}
				writeBuffer[pos] |= (byte) (c << 6);
				return c + 1;
			}
		} else {
			v = ~v;
			int c = writeOptimizedInt(writeBuffer, pos, v);
			writeBuffer[pos] = (byte) (writeBuffer[pos] | 0x20);
			return c;
		}
	}

	public static void main(String[] args) {
		// System.out.println(Long.toBinaryString(MAX_OPTIMIZED_LONG));
		// System.out.println(Long.MAX_VALUE);
		// System.out.println(Long.toBinaryString(MIN_OPTIMIZED_LONG));
		// System.out.println(Long.MIN_VALUE);
		// System.out.println(Long.toBinaryString(0xFF));
		// System.out.println(Long.toBinaryString(0xF0));
		// System.out.println(Long.toBinaryString(0xE0));
		// byte[] buffer = new byte[1024];
		// System.out.println(writeOptimizedInt(buffer, 0, 123));
		// System.out.println((-127) + 256);

	}
}
