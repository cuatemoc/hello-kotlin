package playground.functions

import org.hamcrest.Matchers.hasItems
import org.junit.Assert.assertThat
import org.junit.jupiter.api.Test
import org.mockito.internal.matchers.Equals

class KotlinFunctionsKtTest {

    @Test
    fun mapTestInts() {
        // given
        val listOfInts = (1..10 step 3).toList()

        // when
        val mapToDoubled = listOfInts.mapFunction { value -> value * 2 }

        // then
        assertThat(mapToDoubled.size, Equals(listOfInts.size))
        assertThat(mapToDoubled, hasItems(2, 8, 14, 20))
    }

    @Test
    fun mapTestStrings() {
        // given
        val listOfStrings = listOf<String>("a", "b", "c", "d")

        // when
        val mapToUppercase = listOfStrings.mapFunction { value -> "${value}-${value.toUpperCase()}"}

        // then
        assertThat(mapToUppercase.size, Equals(listOfStrings.size))
        assertThat(mapToUppercase, hasItems("a-A", "b-B", "c-C", "d-D"))
    }

}