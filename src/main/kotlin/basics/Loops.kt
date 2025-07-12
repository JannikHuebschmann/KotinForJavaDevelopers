package basics

fun main() {
    forLoops()
}

fun forLoops() {
    val list = listOf("1", "2", "3", "4", "5")
    //08/15 for-Loop in Kotlin, if you'd want you could declare s as s:String, but it isn't required
    println("Iterating over List...")
    for (s in list) {
        println(s)
    }
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    //You can also iterate over a map
    println("Iterating over Map...")
    for ((key, value) in map) {
        println("$key: $value")
    }

    //And over lists with an index
    println("Iterating over indexed List...")
    for ((index, entry) in list.withIndex()) {
        println("$index: $entry")
    }

    //Iterating over a range, there are two options
    println("Counting from 1 to 10")
    for(i in 1..10){
        //x..y iterates over all values from x to y, so the given range will print everything from 1 to (including) 10
        print("$i,")
    }

    println("Counting from 1 UNTIL 10")
    for (i in 1 until 10){
        //x until y iterates over all values from x UNTIL y, which would be equal to < 10 instead of <=10 in Java terms
        print("$i,")
    }

    //You can even count down and / or include a step in your iteration
    println("Counting down with a step of 2")
    for(i in 10 downTo 1 step 2){
        print("$i,")
    }

    //or over a String
    for(c in "ABC") {
        print(c)
    }
}