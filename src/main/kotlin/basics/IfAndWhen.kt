package basics

import basics.Color.*
import supportClasses.Cat
import supportClasses.Dog
import supportClasses.Pet

fun main() {
    ifWhen()
    whenWithNConditions("y")
    whenWithNConditions("yes")
    whenExpressionFuckery(42)
    usefulExpressionConditions(true, true)
}

enum class Color {
    BLUE, ORANGE, RED, PINK
}

private fun ifWhen() {
    //"if" is an expression and can be used in place of the Java Ternary Operator as mentioned before:
    val number = if (Math.random() > 0.5) 1 else 0;
    println("Number assigned by if-expression: $number")

    //"when" can be seen as an analogy to the Java "switch" statement and can also be used as an expression.
    //Note that you could omit the return entirely and have an expressional syntax with:
    //fun getTemperature(...): String = when(...)...
    fun getTemperature(color: Color): String {
        val temp = when (color) {
            BLUE -> "cold"
            ORANGE -> "warm"
            RED -> "hot"
            PINK -> "very hot"
        }
        return temp
    }
    println("Temperature determined by when-expression: ${getTemperature(PINK)}")
}

//Here an output has multiple valid cases, also note the expressional function syntax
//If you execute the main function in this file, you will find that the two function calls will both return "You agree"
private fun whenWithNConditions(input: String) = when (input) {
    "y", "yes", "YES" -> "You agree"
    "n", "no", "NO" -> "You disagree"
    else -> "What do you mean?"
}

//Since ANY expression can do as a branch condition, you COULD theoretically have another "when", however you
//may get at least shamed or actually skinned alive by your colleagues if god forbid anyone else has to debug this.
private fun whenExpressionFuckery(input: Int) {
    println("Performing Black Magic Fuckery...")
    val unholyOutput = when (when (input) {
        1 -> "A"
        2 -> "B"
        else -> "C"
    }) {
        "A" -> "Teil A"
        "B" -> "Teil B"
        else -> "Teil C"
    }
    println(unholyOutput)
}

//A more "sane" use case for expressions as branch conditions would be something like this...
private fun usefulExpressionConditions(
    simplePermission: Boolean, privPermission: Boolean
) = when (setOf(simplePermission, privPermission)) {
    setOf(false, false) -> "Access denied"
    setOf(true, false) -> "Read only access granted"
    setOf(true, true) -> "Write level access granted"
    else -> "Non valid combination of permission, Access denied!"
}

//A when-expression can also include type-checks with "is"
//"is" automatically smart casts Pet to the given Class
private fun typeCheckingExpression(pet: Pet) {
    when (pet) {
        is Cat -> pet.meow()
        is Dog -> pet.bark()
    }
}

//When using any boolean-Expression you can omit the argument after the "when"
private fun argumentlessWhenExpression(degrees: Int): Pair<String, Color> =
    when {
        degrees < 5 -> "cold" to BLUE
        degrees < 25 -> "mild" to ORANGE
        else -> "hot" to RED
    }



