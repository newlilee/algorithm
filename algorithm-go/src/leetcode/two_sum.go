package leetcode

// AddTwoNum add two number brute force
func AddTwoNum(array []int, target int) []int {
	if array == nil || len(array) == 0 {
		return []int{}
	}
	for idx := 0; idx < len(array); idx++ {
		for jdx := idx + 1; jdx < len(array); jdx++ {
			if target-array[jdx] == array[idx] {
				return []int{idx, jdx}
			}
		}
	}
	return []int{}
}

// AddTwoNumWithHash use hash
func AddTwoNumWithHash(array []int, target int) []int {
	if array == nil || len(array) == 0 {
		return []int{}
	}
	arrayMap := make(map[int]int)
	for idx, val := range array {
		arrayMap[val] = idx
	}
	for idx, val := range array {
		tag := target - val
		if _, ok := arrayMap[tag]; ok {
			return []int{idx, arrayMap[tag]}
		}
	}
	return []int{}
}

// AddTwoNumOnePassHash use one pass hash
func AddTwoNumOnePassHash(array []int, target int) []int {
	if array == nil || len(array) == 0 {
		return []int{}
	}
	arrayMap := make(map[int]int)
	for idx, val := range array {
		tag := target - val
		if _, ok := arrayMap[tag]; ok {
			return []int{idx, arrayMap[tag]}
		}
		arrayMap[val] = idx
	}
	return []int{}
}
