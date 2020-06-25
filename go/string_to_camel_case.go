package tdd

import (
	"strings"
	"unicode"
)

func ToCamelCase(s string) string {
	for strings.IndexAny(s, "-_") > -1 {
		index := strings.IndexAny(s, "-_")
		if index < len(s) - 1 {
			charArray := []rune(s)
			charArray[index + 1] = unicode.ToUpper(charArray[index + 1])
			s = string(charArray)
		}
		s = strings.Replace(s, string(s[index]), "", 1)
	}
	return s
}
