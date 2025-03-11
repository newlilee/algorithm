package common

import "testing"

func TestStackArray_IsEmpty(t *testing.T) {
	stack := NewStack()
	t.Log(stack)
	for idx := 0; idx < 10; idx++ {
		v := stack.Push(idx)
		t.Log("v:", v)
	}
	t.Log(stack.Size())
	t.Log(stack)
	for !stack.IsEmpty() {
		t.Log(stack.Pop())
	}
}
