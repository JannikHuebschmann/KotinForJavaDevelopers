package basics

fun main() {
println("I'm a flipped String".flip())
}

//Extension functions allows for a function to be executed directly on the Object without
//having to make use of a helper or utility class
fun String.flip(): String {
    return StringBuilder().append(this).reverse().toString()
}