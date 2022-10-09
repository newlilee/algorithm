package leetcode

import (
	"leetcode/common"
)

// StackSort sort stack
func StackSort(stack *common.StackArray) {
	if stack == nil {
		return
	}
	cacheStack := common.NewStack()
	v := stack.Pop()
	_ = cacheStack.Push(v)
	var top interface{}
	for !stack.IsEmpty() {
		top = stack.Pop()
		for !cacheStack.IsEmpty() && typeConvert(top) > typeConvert(cacheStack.Peek()) {
			stack.Push(cacheStack.Pop())
		}
		cacheStack.Push(top)
	}
	for !cacheStack.IsEmpty() {
		stack.Push(cacheStack.Pop())
	}
}

func typeConvert(value interface{}) int {
	if value != nil {
		switch value.(type) {
		case int:
			if v, ok := value.(int); ok {
				return v
			}
		default:
			return -1
		}
	}
	return -1
}
