package basics

fun main() {
    println("Hello Kotlin!")
    mainWithStringTemplates()
    mainWithIfExpression()
    mainWithStringTemplateFunctionCall()
    mainWithStringNullHandling()
}

private fun mainWithStringTemplates(){
    val name = "Kotlin"
    println("Hello $name!")
}

private fun mainWithIfExpression(){
    // if is an expression and can be used similary to the ternary operator in Java
    val name = if (Math.random() < 0.5) "KOTLIN" else "kotlin"
    println("Hello $name!")
}

private fun mainWithStringTemplateFunctionCall(){
    println("Hello ${stringFunctionCall()}!")
}

private fun stringFunctionCall(): String{
    //if can also be used in a return statement
    return if (Math.random() < 0.5) "KOTLIN" else "kotlin"
}

private fun mainWithStringNullHandling(){
    //As at Bytecode level, Java.lang.String is called, will print "Hello, null"
    println("Hello, ${null}!")
}

