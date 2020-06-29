import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RowSumOddNumbersKtTest {

    @Test
    fun rowSumOddNumbers() {
        assertEquals(1, rowSumOddNumbers(1))
        assertEquals(8, rowSumOddNumbers(2))
        assertEquals(27, rowSumOddNumbers(3))
        assertEquals(2197, rowSumOddNumbers(13))
        assertEquals(6859, rowSumOddNumbers(19))
        assertEquals(68921, rowSumOddNumbers(41))
        assertEquals(74088, rowSumOddNumbers(42))
        assertEquals(405224, rowSumOddNumbers(74))
        assertEquals(636056, rowSumOddNumbers(86))
        assertEquals(804357, rowSumOddNumbers(93))
        assertEquals(1030301, rowSumOddNumbers(101))
    }
}