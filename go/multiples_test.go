package tdd

import (
"github.com/stretchr/testify/assert"
"testing"
)

func TestMultiple3And5(t *testing.T) {
	assert.Equal(t, 23, Multiple3And5(10))
	assert.Equal(t, 0, Multiple3And5(0))
}