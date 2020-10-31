import java.util.*

fun main(args: Array<String>) {
    println(if (args[0].toInt() < 12) "Good  Morning" else "Good night")
    //feed fish challenge
    //feedFish()
    //getFortune
   // println(getFortune())
    //mood app
    //giveCommand()
    //dirty processor
    //dirtyProcessor()

    val program = Program()
    program.addTwoNumbers(1, 5)
    program.addTwoNumbers(1, 5, object : MyInterface {
        override fun execute(sum: Int) {
            println(sum)
        }

    })
    val members: MutableList<String> = mutableListOf()
    while (true) {
        print("Please enter your  choice: ")
        val name = readLine()!!.toInt()
        when (name) {
            1 -> addMember(members)
            2 -> removeMember(members)
            3 -> listOfMembers(members)
        }
    }
}

fun addMember(members: MutableList<String>) {
    print("Enter your name: ")
    val name = readLine()
    if (name != null) {
        members.add(name)
    }

}

fun removeMember(members: MutableList<String>) {
    println("Plaese enter name you want to remove: ")
    val remName = readLine()
    if (members.contains(remName)) {
        members.remove(remName)
    } else {
        println("Name you searched for is not in this list!!!")
    }
}

fun listOfMembers(members: MutableList<String>) {
    for (member in members) {
        println(member)
    }
}

