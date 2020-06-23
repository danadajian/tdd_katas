package tdd

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestTwoOldestAges(t *testing.T) {
	assert.Equal(t, [2]int{18,83}, TwoOldestAges([]int{6,5,83,5,3,18}))
	assert.Equal(t, [2]int{45,87}, TwoOldestAges([]int{1,5,87,45,8,8}))
	assert.Equal(t, [2]int{95,99}, TwoOldestAges([]int{39,53,83,51,59,61,95,23,99,49}))
}