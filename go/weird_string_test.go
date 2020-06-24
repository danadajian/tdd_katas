package tdd

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test_toWeirdCase(t *testing.T) {
	assert.Equal(t, "AbC DeF", toWeirdCase("abc def"))
	assert.Equal(t, "AbC", toWeirdCase("ABC"))
	assert.Equal(t, "ThIs Is A TeSt LoOkS LiKe YoU PaSsEd",
		toWeirdCase("This is a test Looks like you passed"))
}