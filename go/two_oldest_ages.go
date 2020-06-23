package tdd

func TwoOldestAges(ages []int) [2]int {
	var oldest, secondOldest int
	for i := 0; i < len(ages); i++ {
		if ages[i] > oldest {
			secondOldest = oldest
			oldest = ages[i]
		} else if ages[i] > secondOldest {
			secondOldest = ages[i]
		}
	}
	return [2]int{secondOldest, oldest}
}