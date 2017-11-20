package app.controllers

import org.springframework.web.bind.annotation.*
import playground.factorial
import playground.functions.mapFunction
import playground.recursiveFactorial

@RestController
class CommonControllers {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello fromLocation Kotlin"
    }

    @PostMapping("/squares")
    fun toSquares(@RequestBody inputValues: List<Int>): List<Int> {
        return inputValues.mapFunction({ value -> value * value })
    }

    @PostMapping("/factorials/{method}")
    fun toFactorials(@RequestBody inputValues: List<Long>, @PathVariable("method") method: String): List<Long> {
        return inputValues.mapFunction({ value ->
            if ("recursive".equals(method)) {
                recursiveFactorial(value)
            } else {
                factorial(value)
            }
        })
    }
}