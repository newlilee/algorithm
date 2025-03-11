package chaptertwo

import (
	"testing"
)

func TestSortByTree(t *testing.T) {
	array := []int{5, 7, 6, 1, 4, 3, 2}
	SortByTree(array)
	PrintArray(array)
}
