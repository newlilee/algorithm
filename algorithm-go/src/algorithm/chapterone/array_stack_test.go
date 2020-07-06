package chapterone

import (
	"testing"
)

func TestArrayStack_Push(t *testing.T) {
	var stack ArrayStack
	var array StackArray

	stack = &array
	t.Log(stack)
	for idx := 0; idx < 10; idx++ {
		stack.Push(idx)
	}
	t.Log(stack.Size())
	t.Log(stack)
	for idx := 10; idx > 0; idx-- {
		if !stack.IsEmpty() {
			t.Log(stack.Pop())
		}
	}
}