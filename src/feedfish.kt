import java.util.*

fun feedFish() {
    val day = randomly()
    val food = fishfood(day)
    println("Today is ${day} and our fish is eating  $food")
}

fun randomly(): String {
    val week = listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    return week[Random().nextInt(7)]
}

fun fishfood(day: String): String {
    return when (day) {
        "Mon" -> "bread"
        "Tue" -> "cheese"
        "Wed" -> "lettuce"
        "Thu" -> "oil"
        "Fri" -> "cucumber"
        "Sat" -> "tomato"
        "Sun" -> "plankton"
        else -> "fasting"
    }
}