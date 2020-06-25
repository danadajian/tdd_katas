package tdd

func MaxMultiple(divisor, bound int) int {
	for bound % divisor > 0 {
		bound--
	}
	return bound
}