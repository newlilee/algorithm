package leetcode

import (
	"testing"
)

func TestAddTwoNum(t *testing.T) {
	array := []int{1, 3, 5, 7, 10, 8}
	target := 8
	result := AddTwoNum(array, target)
	t.Log(result)
}

func TestAddTwoNumWithHash(t *testing.T) {
	array := []int{1, 3, 5, 7, 10, 8}
	target := 8
	result := AddTwoNumWithHash(array, target)
	t.Log(result)
}

func TestAddTwoNumOnePassHash(t *testing.T) {
	array := []int{1, 3, 5, 7, 10, 8}
	target := 8
	result := AddTwoNumOnePassHash(array, target)
	t.Log(result)
}
