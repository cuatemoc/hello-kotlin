package playground.classes

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClassHavingCompanionTest {

    @Test
    fun fromCompanion() {
        val tested = ClassHavingCompanion()

        assertEquals("Doing my companion stuff", tested.fromCompanion())
        assertEquals("other companion stuff", ClassHavingCompanion.Companion.otherCompanionFunction())
    }
}