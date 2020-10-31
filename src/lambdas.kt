
class Program {


    //region with Interface
    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {
        val sum = a + b
        action.execute(sum)

    }
    //endregion

    //region high level functions way
    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {
        val sum = a + b
        action(sum)
    }

    fun getMyName(action: (String) -> Unit) {
        val name = readLine().toString()
        val message: String
        when {
            name.length < 10 -> message = "Your name is too short"
            name.length > 10 -> message = "Your name is long"
            name.length > 20 -> message = "Your name is too long"
            else -> message = "Sorry we cannot calculate the length of your name"
        }

        action(message)
    }
    //endregion


}

interface MyInterface {
    fun execute(sum: Int)

}
