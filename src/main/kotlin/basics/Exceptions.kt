package basics

import java.io.IOException
import java.lang.NumberFormatException

fun main() {
    basicException()
}

//Kotlin Exceptions, are (surprise...) also expressions and thus can be declared in a variable
private fun basicException() {
    val number = 105
    val percentage =
        if (number in 1..10) number else throw IllegalArgumentException("Number must be between 1 and 100")
}

//The try-catch block is an expression as well and could be used like this
private fun tryCatch(): Int {
    val invalidNumber = "I'm a String!"
    return try {
        Integer.parseInt(invalidNumber)
    } catch (e: NumberFormatException) {
        return 0
    }
}

//Since checked Exceptions do not exist in Kotlin, to preserve the functionality, you may annotate a function with @Throws
@Throws(IOException::class)
private fun checkedException() {
    throw IOException("Kind of a checked exception")
}
