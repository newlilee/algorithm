package leetcode

// TwoSum 167. Two Sum II - Input array is sorted
func TwoSum(array []int, target int) []int {
	left := 0
	right := len(array) - 1
	for left < right {
		sum := array[left] + array[right]
		if sum == target {
			return []int{left + 1, right + 1}
		} else if sum < target {
			left++
		} else if sum > target {
			right--
		}
	}
	return []int{-1, -1}
}
