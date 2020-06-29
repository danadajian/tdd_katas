import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GetMiddleCharacterKtTest {

    @Test
    fun getMiddleCharacter() {
        assertEquals("t", getMiddleCharacter("mtv"))
        assertEquals("t", getMiddleCharacter("testing"))
        assertEquals("A", getMiddleCharacter("A"))
        assertEquals("es", getMiddleCharacter("test"))
        assertEquals("dd", getMiddleCharacter("middle"))
    }
}