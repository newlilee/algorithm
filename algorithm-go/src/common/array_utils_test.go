package common

import (
	"log"
	"testing"
)

func TestAppendOneBetween(t *testing.T) {
	array := []int{1, 3}
	ret := AppendOneBetween(array, 2, 1)
	log.Println(ret)
}

func TestAppendBetween(t *testing.T) {
	array := []int{1, 4, 5}
	x := []int{2, 3}
	ret := AppendBetween(array, x, 1)
	log.Println(ret)
}

func TestReverseArray(t *testing.T) {

}

func TestDeleteTail(t *testing.T) {
	array := []int{1, 2, 3, 4, 5}
	ret := DeleteTail(array)
	log.Println(ret)
}
