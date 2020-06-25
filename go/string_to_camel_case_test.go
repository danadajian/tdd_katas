package tdd

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestToCamelCase(t *testing.T) {
	assert.Equal(t, "", ToCamelCase(""))
	assert.Equal(t, "constant", ToCamelCase("constant"))
	assert.Equal(t, "hyphenatedWord", ToCamelCase("hyphenated-word"))
	assert.Equal(t, "differentThing", ToCamelCase("different-thing"))
	assert.Equal(t, "differentThingAgain", ToCamelCase("different-thing-again"))
	assert.Equal(t, "weird", ToCamelCase("weird-"))
	assert.Equal(t, "underlinedWord", ToCamelCase("underlined-word"))
	assert.Equal(t, "underlinedWordAgain", ToCamelCase("underlined-word-again"))
	assert.Equal(t, "weird", ToCamelCase("weird_"))
	assert.Equal(t, "weirdStringHere", ToCamelCase("weird_string-here"))
}