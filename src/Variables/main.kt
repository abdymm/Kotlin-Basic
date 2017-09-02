package Variables

fun main(args: Array<String>) {
    val born: Int = 1993
    val age: Int = 23
    //age = 24 val == final on java, cannot be reassigned

    var firstName = "Abdy"
    var lastName: String = "Malik Mulky"
    var hobby: String = "Reading"

    println("$firstName $lastName, Hobby : $hobby, Born : $born")

    hobby = "Gaming"

    println("$firstName $lastName, Hobby : $hobby, Born : $born")


}