package leetcode

var numLetterMap = map[string]string{
	"2": "abc",
	"3": "def",
	"4": "ghi",
	"5": "jkl",
	"6": "mno",
	"7": "pqrs",
	"8": "tuv",
	"9": "wxyz",
}

var combinations []string

// LetterCombinations letter combination
func LetterCombinations(digits string) []string {
	combinations = []string{}
	if digits == "" {
		return combinations
	}
	backtrack(digits, 0, "")
	return combinations
}

func backtrack(digits string, idx int, combination string) {
	if idx == len(digits) {
		combinations = append(combinations, combination)
	} else {
		digit := string(digits[idx])
		letters := numLetterMap[digit]
		for jdx := 0; jdx < len(letters); jdx++ {
			backtrack(digits, idx+1, combination+string(letters[jdx]))
		}
	}
}
