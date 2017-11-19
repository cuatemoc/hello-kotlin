package app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAutoConfiguration
open class KotlinBootApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinBootApplication::class.java, *args)
}
