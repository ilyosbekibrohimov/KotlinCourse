import java.lang.Math.random

//Higher Order Functions



//region lambda
class Program {

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {
        val sum = a + b
        action.execute(sum)

    }

    fun addTwoNumbers(a: Int, b: Int) {
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)

}

//endregion

