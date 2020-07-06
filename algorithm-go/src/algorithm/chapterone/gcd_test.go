package chapterone

import (
	"fmt"
	"testing"
)

func TestGcdRecursive(t *testing.T) {
	retVal := GcdRecursive(16, 4)
	fmt.Println("The gcd is:", retVal)
}

func TestGcdLoop(t *testing.T) {
	retVal := GcdLoop(16, 4)
	fmt.Println("The gcd is:", retVal)
}
