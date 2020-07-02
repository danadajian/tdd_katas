import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PersistenceKtTest {

    @Test
    fun persistence() {
        assertEquals(0, persistence(4))
        assertEquals(1, persistence(33))
        assertEquals(2, persistence(45))
        assertEquals(3, persistence(59))
        assertEquals(1, persistence(123))
        assertEquals(3, persistence(39))
        assertEquals(2, persistence(25))
        assertEquals(4, persistence(999))
    }
}