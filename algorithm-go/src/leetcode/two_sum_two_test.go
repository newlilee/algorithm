package leetcode

import "testing"

func TestTwoSumTwo(t *testing.T) {
	array := []int{1, 2, 3, 4, 6, 7, 8}
	target := 8
	result := TwoSum(array, target)
	t.Log(result)
}
