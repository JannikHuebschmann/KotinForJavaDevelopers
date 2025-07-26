package nullability

//Kotlin has "opt in" Nullability, by default, everything is Kotlin is nullsafe and a null value
//assigned to a normal var or val will not compile.
fun main() {

}

fun nullability() {
    //This wont work:
    //val value: String = null
    //Nullability has to be explicitly enabled with a "?" like this:
    var value: String? = null
    //Ofc a nullable variable can also contain non null values
    value = "also a string"

    //This is also preserved when performing operations on the value, you can not assign the output from a
    //nullable variable to a non nullable type
    //The below won't work
    //val length: String = value.length

    //If-else expression can be used to transform a "?" to a non nullable type by providing an alternative with the "else" block
    val nullSafe = if (value != null) value else "another String input"

    //It could also be shortened to the following
    val anotherNullSafe = value ?: "another one"

    //Kotlin allows for control-flow analysis, meaning after you've explicitly checked a variable for being null / non-null,
    //you can access it like a non-null value

    fun withoutSafeAccess(): Int {
        val mightBeNull: String? = "not actually null"
        if (mightBeNull == null) return 0 else return mightBeNull.length
    }
}
