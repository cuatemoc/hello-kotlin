package playground.delegates

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DoerDerivedTest {

    @Test //TODO SLE: This test if artificial only to check what happens not regular unit test's work
    fun doStuff() {
        val delegate = DoerImpl()
        val tested = DoerDerived(delegate)

        assertEquals(202, tested.doStuff(10, 20))
        assertEquals("anything here", tested.someOtherStuff)
        assertTrue(tested.delegatedProperty.endsWith("property delegated: delegatedProperty"))
        tested.delegatedProperty = "111"
        println(tested.lazyDelegated)
        println(tested.lazyDelegated)

        assertEquals("default", tested.observableDelegated)
        tested.observableDelegated = "first value"
        assertEquals("first value", tested.observableDelegated)
        tested.observableDelegated = "second value"
        assertEquals("second value", tested.observableDelegated)

    }
}