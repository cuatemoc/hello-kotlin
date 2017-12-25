package playground.classes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SampleClassTest {

    @Test
    fun isCreatedWithDefaultConstructorAndInitBlock() {

        val propertyValue = "a property"
        val tested = SampleClass(propertyValue)

        assertEquals(propertyValue.toUpperCase(), tested.someProperty)
        assertEquals("default", tested.otherProperty)
    }

    @Test
    fun isCreatedWithSecondaryConstructor() {

        val propertyValue = "a property"
        val otherProperty = "another property"
        val tested = SampleClass(propertyValue, otherProperty)

        assertEquals(propertyValue.toUpperCase(), tested.someProperty)
        assertEquals(otherProperty, tested.otherProperty)
    }

    @Test
    fun isTestPropertySet() {

        val propertyValue = "a property"
        val testPropertyValue = "testProperty"
        val tested = SampleClass(propertyValue)
        tested.testProperty = testPropertyValue
        assertEquals(testPropertyValue.toUpperCase(), tested.testProperty)
    }

}