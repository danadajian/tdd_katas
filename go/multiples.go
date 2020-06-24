package tdd

func Multiple3And5(number int) int {
	var result int
	for i := 0; i < number; i++ {
		if i % 3 == 0 || i % 5 == 0 {
			result += i
		}
	}
	return result
}