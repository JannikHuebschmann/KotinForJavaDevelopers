package basics

import supportClasses.MemberFunctionHelper

fun main() {
    println("I'm a flipped String".flip())
    standardLibrary()
}

//Extension functions allows for a function to be executed directly on the Object without
//having to make use of a helper or utility class.
//Calling this expression from Java will result in it becoming a static
// Method having an additional Parameter (the String itself)
fun String.flip(): String {
    return StringBuilder().append(this).reverse().toString()
}
//You can not access a private Member of a Class from inside an extension function.

//Kotlin uses extension functions exensively, the standard Kotlin library is "only" made up of the
//standard Java library + extensions, as this example functions shows.

fun standardLibrary() {
    val set = hashSetOf(1, 2, 3)
    val list = arrayListOf(4, 5, 6)
    val map = hashMapOf(1 to "one", 2 to "two")
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}

//As extension are static functions under the hood, they can not be overwritten.
//They also do not hide member functions, if an extension defines a function a member already has it will not be called.
//In this example "memberFunction" is already defined in MemberFunctionHelper, the extension will never take effect.
//An extension function can hoveveer overload a member.
fun MemberFunctionHelper.memberFunction() = 2


