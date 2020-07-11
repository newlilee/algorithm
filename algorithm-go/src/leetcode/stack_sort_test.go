package leetcode

import (
	"leetcode/common"
	"math/rand"
	"testing"
)

func TestStackSort(t *testing.T) {
	stack := common.NewStack()
	for idx := 0; idx < 10; idx++ {
		stack.Push(rand.Intn(100))
	}
	t.Log(stack)
	StackSort(stack)
	t.Log(stack)
}
