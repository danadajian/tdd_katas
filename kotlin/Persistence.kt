fun persistence(num: Int) : Int {
    var counter = 0
    var startingNum = num
    while (startingNum >= 10) {
        startingNum = startingNum
                .toString()
                .toCharArray()
                .map {Character.getNumericValue(it) }
                .reduce { acc, i ->  acc * i }
        counter++
    }
    return counter
}