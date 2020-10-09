import java.util.*



fun main() {

    //region 1. Conditional Statements: Months Program
    println("Welcome to Months of the Year")

    println("Pease enter the Month Number:")

    val read = Scanner(System.`in`)
    val montNumber = read.nextInt()

    when (montNumber) {
        1 -> println("You selected January")
        2 -> println("You selected February")
        3 -> println("You selected March")
        4 -> println("You selected April")
        5 -> println("You selected May")
        6 -> println("You selected June")
        7 -> println("You selected July")
        8 -> println("You selected August")
        9 -> println("You selected September")
        10 -> println("You selected October")
        11 -> println("You selected November")
        12 -> println("You selected December")
        else -> println("Error")
    }
    //endregion
    //region 2. Functions
    println(getGreeeitng()) // print is also function
    sayHello()
    singleExpressionFunction()
    sayHi(word = "Ilyosbek and Kotlin", anotherWord = "This is another text from Kotlin")



    //endregion

}

//region function that returns a value
fun getGreeeitng():String? {
    val greeting= readLine()
    return greeting
}
//endregion
//region function that returns nothing
fun sayHello(){
    print("This function returns nothing")
}
//endregion

//region Single Expression Function
fun singleExpressionFunction(): String = "Single Expression Function"
//endregion

//region function with parameters
fun sayHi(word:String, anotherWord:  String){
   val message = "Hello $word"
    println(message)
    val anotherMessage = "MESSAGE: $anotherWord"
    println(anotherMessage)
}
//endregion
