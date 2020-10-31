fun getFortune(): String {
    val birthday: Int = getBirthDay()
    return when {
        birthday > 10 -> "You are super lucky"
        birthday > 20 -> "You are extra super lucky"
        birthday > 31 -> "You are the most stupid person ever"
        else -> "No no no,  it is impossible hahaha"
    }
}

fun getBirthDay(): Int {
    print("Enter your birthday:")
    val birthday: Int = readLine()!!.toInt()
    return birthday

}