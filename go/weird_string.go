package tdd

import "strings"

func toWeirdCase(str string) string {
	var result string
	var counter int
	for index, char := range str {
		if index == 0 || string(str[index - 1]) == " " {
			counter = 0
		}
		if counter % 2 == 0 {
			result += strings.ToUpper(string(char))
		} else {
			result += strings.ToLower(string(char))
		}
		counter++
	}
	return result
}