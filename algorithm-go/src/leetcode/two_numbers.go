package leetcode

// ListNode list node
type ListNode struct {
	val  int
	next *ListNode
}

// AddTwoNumbers add two list node
func AddTwoNumbers(first *ListNode, second *ListNode) *ListNode {
	if first == nil || second == nil {
		return nil
	}
	finalHead := new(ListNode)
	p := first
	q := second
	curr := finalHead
	carry := 0
	for p != nil || q != nil {
		idx := 0
		jdx := 0
		if p != nil {
			idx = p.val
		}
		if q != nil {
			jdx = q.val
		}
		sum := carry + idx + jdx
		carry = sum / 10
		curr.next = new(ListNode)
		curr.next.val = sum % 10
		curr = curr.next
		if p != nil {
			p = p.next
		}
		if q != nil {
			q = q.next
		}
	}
	if carry > 0 {
		curr.next = new(ListNode)
		curr.next.val = carry
	}
	return finalHead.next
}
