package leetcode

import (
	"fmt"
	"testing"
)

func TestThreeSum(t *testing.T) {
	// case 1
	caseOne := []int{1, 0, 1, 2, -1, -4}
	fmt.Println(ThreeSum(caseOne))
	// case 2
	caseTwo := []int{0, 1, 1}
	fmt.Println(ThreeSum(caseTwo))
	// case 3
	caseThree := []int{0, 0, 0}
	fmt.Println(ThreeSum(caseThree))
}
