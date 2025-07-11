package basics

import basics.Color.*

fun main() {
    ifWhen()
    whenWithNConditions("y")
    whenWithNConditions("yes")
    whenExpressionFuckery(42)
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

