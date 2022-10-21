package com.util;

import java.util.Objects;

/**
 * @author clx
 */
public final class StringUtils {
	private StringUtils() {
	}

	/**
	 * empty string
	 */
	public static final String EMPTY = "";

	/**
	 * check string blank
	 *
	 * @param cs string
	 * @return bool
	 */
	public static boolean isBlank(final CharSequence cs) {
		final int strLen = length(cs);
		if (strLen == 0) {
			return true;
		}
		for (int idx = 0; idx < strLen; idx++) {
			if (!Character.isWhitespace(cs.charAt(idx))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * string length
	 *
	 * @param cs string
	 * @return length
	 */
	public static int length(final CharSequence cs) {
		return Objects.isNull(cs) ? 0 : cs.length();
	}

	/**
	 * check string end with suffix
	 *
	 * @param str    string
	 * @param suffix suffix
	 * @return boolean
	 */
	public static boolean endsWith(final CharSequence str, final CharSequence suffix) {
		return false;
	}
}
