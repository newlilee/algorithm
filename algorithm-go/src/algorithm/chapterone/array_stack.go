package chapterone

import (
	"errors"
	"sync"
)

type ArrayStack interface {
	Push(data interface{})     // push
	Pop() (interface{}, error) // pop
	Top() (interface{}, error) // top
	Size() int                 // size
	IsEmpty() bool             // empty
	IsFull() bool              // full
}

type Element interface{}

type StackArray struct {
	element []Element
	lock    *sync.RWMutex
}

func NewStack() *StackArray {
	element := []Element{nil}
	lock := &sync.RWMutex{}
	return &StackArray{element: element, lock: lock}
}

// push
func (array *StackArray) Push(data interface{}) {
	array.lock.Lock()
	defer array.lock.Unlock()
	array.element = append(array.element, data)
}

// pop
func (array *StackArray) Pop() (interface{}, error) {
	array.lock.Lock()
	defer array.lock.Unlock()
	currentPointer := array.element
	if len(currentPointer) == 0 {
		return nil, errors.New("index out of bound")
	}
	value := currentPointer[len(currentPointer)-1]
	array.element = currentPointer[:len(currentPointer)-1]
	return value, nil
}

// top
func (array *StackArray) Top() (interface{}, error) {
	array.lock.RLock()
	defer array.lock.RUnlock()
	if len(array.element) == 0 {
		return nil, errors.New("index out of bound")
	}
	return array.element[len(array.element)-1], nil
}

// size
func (array *StackArray) Size() int {
	array.lock.RLock()
	defer array.lock.RUnlock()
	return len(array.element)
}

// isEmpty
func (array *StackArray) IsEmpty() bool {
	array.lock.RLock()
	defer array.lock.RUnlock()
	return len(array.element) == 0
}

// isFull
func (array *StackArray) IsFull() bool {
	array.lock.RLock()
	defer array.lock.RUnlock()
	return len(array.element) == cap(array.element)
}
