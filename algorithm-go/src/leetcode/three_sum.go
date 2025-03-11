package leetcode

import "sort"

// ThreeSum use sort and three pointer
func ThreeSum(nums []int) [][]int {
	length := len(nums)
	sort.Ints(nums)
	sumResult := make([][]int, 0)
	for idx := 0; idx < length; idx++ {
		if idx > 0 && nums[idx] == nums[idx-1] {
			continue
		}
		kdx := length - 1
		target := -nums[idx]
		for jdx := idx + 1; jdx < length; jdx++ {
			if jdx > idx+1 && nums[jdx] == nums[jdx-1] {
				continue
			}
			for jdx < kdx && nums[jdx]+nums[kdx] > target {
				kdx--
			}
			if jdx == kdx {
				break
			}
			if nums[jdx]+nums[kdx] == target {
				sumResult = append(sumResult, []int{nums[idx], nums[jdx], nums[kdx]})
			}
		}
	}
	return sumResult
}
