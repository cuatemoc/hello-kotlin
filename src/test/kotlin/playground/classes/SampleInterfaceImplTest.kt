package playground.classes

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SampleInterfaceImplTest {

    @Test
    fun getMaster() {

        val impl = SampleInterfaceImpl()

        assertEquals(1, impl.masterProp)
        assertEquals("Something", impl.masterFun())
        assertEquals("barImpl", impl.bar())
        assertEquals("other", impl.foo())

    }
}