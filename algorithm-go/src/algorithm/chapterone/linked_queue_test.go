package chapterone

import (
	"testing"
)

func TestLinkedQueueNode_LinkedEnquque(t *testing.T) {
	var queue LinkedQueue
	queue = InitLinkedQueue()
	for idx := 0; idx < 10; idx++ {
		queue.LinkedEnqueue(idx)
	}
	t.Log(queue.LinkedSize())
	for !queue.LinkedIsEmpty() {
		t.Log(queue.LinkedDequeue())
	}

}
