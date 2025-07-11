package basics

fun main() {
    namedArguments()
}

private fun namedArguments() {
    //The below lines of code produce the identical result. The second print-statement makes
    //use of named arguments where you can explicitly define the name of the argument when passing
    //the value. On its own in this context this is kind of useless as IntelliJ gives the corresponding
    //name hint on its own, named arguments can however be useful later.
    println(listOf("Hi,", "my", "name", "is", "slim", "shady").joinToString(" "))
    //@formatter:off
    println(listOf("Hi,", "my", "name", "is", "slim", "shady").joinToString(separator = " "))
    //@formatter:on
}

private fun defaultArguments(){
    //This local function has default values for its arguments, calling this fun "plain" will print "# # # # # "
    fun littleLocalFunction(characterToRepeat: Char ='#', timesToRepeat: Int =5){
        repeat(timesToRepeat){
            print("$characterToRepeat ")
        }
    }
    littleLocalFunction()
    //You can change the default by explicitly defining the arguments in the function, this will print"/ / / / / / / "
    littleLocalFunction('/',7)
    //Now, the named arguments from earlier come into play. Want to change just a single one of these default parameters?
    //Just use a named argument for the one you want to change, you don't have to repeat the default again.
    littleLocalFunction(timesToRepeat = 3)
    //This will keep the default char of '#' but will repeat 3 times instead of 5, output will be "# # # "
}

//If you'd want to call this function using default arguments from Java, you will have to parse a value
//for every function argument even though in Kotlin we've set default arguments UNLESS its annotated with @JvmOverloads,
//then the default parameters are preserved at bytecode level via constructor overloading.
@JvmOverloads
fun defaultArgumentsForJava(characterToRepeat: Char ='#', timesToRepeat: Int =5){
    repeat(timesToRepeat){
        print("$characterToRepeat ")
    }
}