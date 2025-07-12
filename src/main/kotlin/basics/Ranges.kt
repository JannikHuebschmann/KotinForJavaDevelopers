package basics

import supportClasses.CustomComparable
import java.time.LocalDate

fun main() {
    iterateWithIn()
    checkForBelonging('a')
    noUppercaseLetter('b')
    digitOrLetter('0')
    inList()
    stringRanges()
}

//The in keyword can be used for two usecases. To either check for belonging or for iteration

private fun iterateWithIn() {
    for (letter in 'a'..'z') {
        print("$letter,")
    }
}

//"in" can also be used to check if an element belongs to a list like this
private fun inList(): Boolean {
    return "Kotlin" in listOf("Java","Scala","Groovy","Kotlin")
}

//Checks if the given char is a lowercase letter of the alphabet
private fun checkForBelonging(char: Char) =
    if (char in 'a'..'z') true else false

//Can also be used with '!' for a "not in" functionality

private fun noUppercaseLetter(char: Char) =
    if (char !in 'A'..'Z') true else false

//And as an expression in "where"
private fun digitOrLetter(char: Char): String {
    return when (char) {
        in '0'..'9' -> "It's a digit"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter"
        else -> "It's neither"
    }
}

//Any Comparable can be part of a range
private fun differentRanges() {
    val intRange = 1..9
    val charRange = 'a'..'z'
    val stringRange = "aa".."az"
    val dateRange = LocalDate.parse("01-01-2025")..LocalDate.now()
    //Classes that implement Comparable can also be used in ranges
    val customComparableRange = CustomComparable()..CustomComparable()
}


//String ranges always compare the fist letter of the String, only if they are the same the
//second letter will be compared, then the third an so on...
private fun stringRanges(){
    val isTrue = "ball" in "a".."k"
    val isFalse = "zoo" in "a".."k"
    //That is how this expression is true, however strange it may look
    val isAlsoTrue = "Kotlin" in "Java".."Scala"
    print("$isTrue, $isFalse, $isAlsoTrue")
}

