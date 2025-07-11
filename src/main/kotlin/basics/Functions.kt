@file:JvmName("KotlinFile")
package basics

fun main() {

}

private fun basicFunSyntax(number: Int, anotherNumber: Int): Int {
    return if (number > anotherNumber) number else anotherNumber
}
//The above can be simplified if the return value of the function is a plain expression like this

private fun basicExpressionalSyntax(number: Int, anotherNumber: Int) =
    if (number > anotherNumber) number else anotherNumber

//If there is no explicit type to be returned the function return type will default to "Unit" wich is analog
//to Java "void", it can be specified explicitly, but it's kinda useless

//This is not private for a reason...
fun printStuff(){
    println("Hi")
}
//The above implicitly does this
private fun printStuffAgain(): Unit{
    println("Hi as well")
}

//Functions everywhere: Functions can be specified at three different levels.
//So far, everything has been a (private) top level function, functions can however be part of a class
// (member functions) or even defined inside another function (local function)

class FunctionHolder(){
    fun doStuff(){
        println("Doing stuff...")
    }

    fun delegateDoingStuff(){
        println("Letting a local function do the work:")
        fun delegate(){
            println("Doing stuff...")
        }
    }
}

//Top Level functions can be accessed from Java Files as a static function, you can specify the name of the
//imported file with the annotation in line 1, otherwise it will default to the filename+"Kt"