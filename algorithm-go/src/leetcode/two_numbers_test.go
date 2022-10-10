package leetcode

import (
	"testing"
)

func TestAddTwoNumbers(t *testing.T) {
	first := new(ListNode)
	first.val = 2
	first.next = new(ListNode)
	first.next.val = 4
	first.next.next = new(ListNode)
	first.next.next.val = 3
	second := new(ListNode)
	second.val = 5
	second.next = new(ListNode)
	second.next.val = 6
	second.next.next = new(ListNode)
	second.next.next.val = 4

	ret := AddTwoNumbers(first, second)
	for ret != nil {
		t.Log(ret.val)
		ret = ret.next
	}
}
