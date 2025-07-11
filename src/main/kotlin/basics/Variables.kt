package basics

fun main() {
    variables()
    typeInference()
    listTypes()
}

fun variables() {
    val question = "How are you?"
    println(question)
    //As "val" describes an immutable Variable, the following line would result in a compile error if commented in
    //question = "How are you really?"

    //If you need to reassign a variable, use "var" instead,
    // this is the Kotlin equivalent of using or not using "final" before your variables
    var variableAnswer = "Im fine"
    println(variableAnswer)
    variableAnswer = "Im okay"
    println(variableAnswer)

}

private fun typeInference() {
    //The Kotlin Compiler can infer types automatically at compile time, this:
    val greeting: String = "Hi"
    val number: Double = 25.5
    println(greeting + ", " + number)
    //is the same as this:
    val inferredGreeting = "Hi"
    val inferredNumber = 25.5
    println(inferredGreeting + ", " + inferredNumber)
    //This remains statically typed, the compiler just does it automatically for you
}

private fun listTypes() {
    //This is valid Kotlin code:
    val list = mutableListOf("Java")
    list.add("Kotlin")
    //as the "val" only contains a reference to the object, this however, won't work:

    //list = mutableListOf("Kotlin")

    //as we would be now redeclaring a val variable
    //There are also two different types of Lists in Kotlin, see the following example:

    var test = listOf("Java")
    //test.add("Kotlin")
    //The commented line will result in an error as "listOf" produces a readOnly-List that can not be modified,
    //even if stored in a var variable
}