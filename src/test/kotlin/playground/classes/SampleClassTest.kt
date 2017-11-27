package playground.classes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SampleClassTest {

    @Test
    fun isCreatedWithDefaultConstructorAndInitBlock() {

        val propertyValue = "a property"
        val tested = SampleClass(propertyValue)

        assertEquals(tested.someProperty, propertyValue.toUpperCase())
        assertEquals(tested.otherProperty, "default")
    }

    @Test
    fun isCreatedWithSecondaryConstructor() {

        val propertyValue = "a property"
        val otherProperty = "another property"
        val tested = SampleClass(propertyValue, otherProperty)

        assertEquals(tested.someProperty, propertyValue.toUpperCase())
        assertEquals(tested.otherProperty, otherProperty)
    }

}