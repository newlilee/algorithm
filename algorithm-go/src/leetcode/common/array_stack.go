package common

import (
	"sync"
)

type ArrayStack interface {
	Push(data interface{}) interface{} // push
	Pop() interface{}                  // pop
	Peek() interface{}                 // peek
	Size() int                         // size
	IsEmpty() bool                     // isEmpty
	IsFull() bool                      // isFull
}

type Element interface{}

type StackArray struct {
	element []Element     // element
	lock    *sync.RWMutex // rw lock
}

func NewStack() *StackArray {
	var element []Element
	lock := &sync.RWMutex{}
	return &StackArray{element: element, lock: lock}
}

// Push push element to stack
func (array *StackArray) Push(data interface{}) interface{} {
	array.lock.Lock()
	defer array.lock.Unlock()
	if data != nil {
		array.element = append(array.element, data)
		return data
	}
	return nil
}

// Pop pop element
func (array *StackArray) Pop() interface{} {
	array.lock.Lock()
	defer array.lock.Unlock()
	if len(array.element) == 0 {
		return nil
	}
	currArray := array.element
	topVal := currArray[len(currArray)-1]
	array.element = currArray[:len(currArray)-1]
	return topVal
}

// Peek peek element
func (array *StackArray) Peek() interface{} {
	array.lock.RLock()
	defer array.lock.RUnlock()
	if len(array.element) == 0 {
		return nil
	}
	return array.element[array.Size()-1]
}

// Size return stack size
func (array *StackArray) Size() int {
	array.lock.RLock()
	defer array.lock.RUnlock()
	return len(array.element)
}

// IsEmpty return stack is empty
func (array *StackArray) IsEmpty() bool {
	array.lock.RLock()
	defer array.lock.RUnlock()
	return len(array.element) == 0
}

// IsFull return stack is full
func (array *StackArray) IsFull() bool {
	array.lock.RLock()
	defer array.lock.RUnlock()
	return len(array.element) == cap(array.element)
}
