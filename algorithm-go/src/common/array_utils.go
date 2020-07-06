package common

import (
	"log"
)

// AppendAtHead append x at target head
func AppendAtHead(target, x []int) []int {
	if x == nil || len(x) == 0 {
		return target
	}
	target = append(x, target...)
	return target
}

// AppendAtTail append x at target tail
func AppendAtTail(target, x []int) []int {
	if x == nil || len(x) == 0 {
		return target
	}
	target = append(target, x...)
	return target
}

// AppendOneBetween append x to target at idx
func AppendOneBetween(target []int, x, idx int) []int {
	if idx > len(target) {
		log.Fatalf("idx out of bound at target, idx=%d, target len=%d", idx, len(target))
	}
	target = append(target, 0)
	copy(target[idx+1:], target[idx:])
	target[idx] = x
	return target
}

// AppendBetween append x to target at idx
func AppendBetween(target, x []int, idx int) []int {
	if x == nil || len(x) == 0 {
		return target
	}
	if idx > len(target) {
		log.Fatalf("idx out of bound at target, idx=%d, target len=%d", idx, len(target))
	}
	target = append(target, x...)
	copy(target[idx+len(x):], target[idx:])
	copy(target[idx:], x)
	return target
}

// DeleteHead delete from target at head
func DeleteHead(target []int) []int {
	// return target[1:]

	// target = append(target[:0], target[1:]...)
	// return target

	target = target[0:copy(target, target[1:])]
	return target
}

// DeleteTail delete from target at tail
func DeleteTail(target []int) []int {
	//return target[:len(target)-1]

	//target = append(target[:0], target[0:len(target)-1]...)
	//return target

	target = target[0:copy(target, target[:len(target)-1])]
	return target
}

// DeleteOneBetween delete from target
func DeleteOneBetween(target []int, idx int) []int {
	// target = append(target[:idx], target[idx+1:]...)
	// return target

	target = target[:idx+copy(target[idx:], target[idx+1:])]
	return target
}

// DeleteMultiBetween delete any index present in target
func DeleteMultiBetween(target []int, idx, count int) []int {
	// target = append(target[:idx], target[idx+count:]...)
	// return target

	target = target[:idx+copy(target[idx:], target[idx+count:])]
	return target
}

// DeleteLastOne delete last one from target
func DeleteLastOne(target []*int) []*int {
	target[len(target)-1] = nil
	target = target[:len(target)-1]
	return target
}

// ReverseArray reverse array
func ReverseArray(target []int) []int {

	return target
}

// TrimSpace trim space of []byte
func TrimSpace(s []byte) []byte {
	retVal := s[:0]
	for _, val := range s {
		if val != ' ' {
			retVal = append(retVal, val)
		}
	}
	return retVal
}

// Filter filter array ele
func Filter(s []byte, fn func(x byte) bool) []byte {
	retVal := s[:0]
	for _, val := range s {
		if !fn(val) {
			retVal = append(retVal, val)
		}
	}
	return retVal
}
