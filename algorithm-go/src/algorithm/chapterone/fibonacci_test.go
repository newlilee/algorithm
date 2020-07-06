package chapterone

import (
	"fmt"
	"testing"
)

func TestFibonacci(t *testing.T) {
	for index := 0; index <= 15; index++ {
		fmt.Println(index, ":", Fibonacci(index))
	}
}
