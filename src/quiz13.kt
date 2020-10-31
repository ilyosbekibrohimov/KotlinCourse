fun whatShouldIDoToday(): String {

    return when {
        isGreat() -> "That is great!"
        isAwesome() -> "Yeah,  that is awesome"
        else -> isNothing()

    }

}


fun giveCommand() {
    print(whatShouldIDoToday())
}

fun mood() = readLine().toString()
fun weather() = readLine()!!.toString()
fun temperature() = readLine()!!.toInt()

fun isGreat() = mood() == "happy" && weather() == "awesome" && temperature() > 20
fun isAwesome() = mood() == "unhappy" && weather() == "sunny" && temperature() < 10
fun isNothing() = "Hello,  enjoy:)"