package leetcode

import (
	"fmt"
	"testing"
)

func TestLetterCombinations(t *testing.T) {
	// case 1
	caseOne := "23"
	fmt.Println(LetterCombinations(caseOne))
	// case 2
	caseTwo := ""
	fmt.Println(LetterCombinations(caseTwo))
	// case 3
	caseThree := "2"
	fmt.Println(LetterCombinations(caseThree))
}
