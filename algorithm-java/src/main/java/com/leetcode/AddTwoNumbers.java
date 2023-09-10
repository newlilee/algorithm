package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * leetcode.2
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字0之外，这两个数都不会以0开头。
 *
 * @author clx
 */
public class AddTwoNumbers {

	/**
	 * add two list node num
	 *
	 * @param first  first list node
	 * @param second second list node
	 * @return sum
	 */
	public static ListNode addTwoNum(ListNode first, ListNode second) {
		if (first == null && second == null) {
			return new ListNode(0);
		}
		// 结果链表
		ListNode sumListNode = new ListNode(0);
		// first 当前节点
		ListNode firstCurrNode = first;
		// second 当前节点
		ListNode secondCurrNode = second;
		// 结果链表当前节点
		ListNode sumListCurrNode = sumListNode;
		// 进位
		int carry = 0;
		while (firstCurrNode != null || secondCurrNode != null) {
			int firstCurrNodeVal = (firstCurrNode != null) ? firstCurrNode.getVal() : 0;
			int secondCurrNodeVal = (secondCurrNode != null) ? secondCurrNode.getVal() : 0;
			int sum = firstCurrNodeVal + secondCurrNodeVal + carry;
			// 计算进位
			carry = sum / 10;
			// 计算余数
			sumListCurrNode.setNext(new ListNode(sum % 10));
			sumListCurrNode = sumListCurrNode.getNext();
			if (firstCurrNode != null) {
				firstCurrNode = firstCurrNode.getNext();
			}
			if (secondCurrNode != null) {
				secondCurrNode = secondCurrNode.getNext();
			}
		}
		if (carry > 0) {
			sumListCurrNode.setNext(new ListNode(carry));
		}
		return sumListNode.getNext();
	}
}
