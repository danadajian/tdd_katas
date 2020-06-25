package tdd

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestMaxMultiple(t *testing.T) {
	assert.Equal(t, 6, MaxMultiple(2, 7))
	assert.Equal(t, 8, MaxMultiple(2, 8))
	assert.Equal(t, 9, MaxMultiple(3, 10))
	assert.Equal(t, 14, MaxMultiple(7, 17))
	assert.Equal(t, 50, MaxMultiple(10, 50))
	assert.Equal(t, 185, MaxMultiple(37, 200))
	assert.Equal(t, 98, MaxMultiple(7, 100))
}