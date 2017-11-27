package boot

import app.KotlinBootApplication
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(KotlinBootApplication::class))
class KotlinBootApplicationTests {

	@Test
	fun contextLoads() {
	}

}
