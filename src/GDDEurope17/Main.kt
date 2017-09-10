package GDDEurope17

import GDDEurope17.data.CustomerJava
import GDDEurope17.data.CustomerKt
import GDDEurope17.singleton.SingletonKt

fun main(args: Array<String>) {
    //function
    print(sum(10, 20))
    print(printMessage("aku-pesan"))

    //ovveriding

    val ovClass = OveridingClassExample()
    ovClass.signUp("abdy", "password")
    ovClass.signUp("abdy", "password", "jalanan")
    ovClass.signUp("abdy", "password", "jalanan", "abdy@gmail.com")
    ovClass.signUp(password = "abdy", name = "password", email = "jalanan", address = "abdy@gmail.com")


    println()

    //data classes

    val customer = CustomerJava()
    customer.setName("abdy")
    customer.setAddress("jalanan")
    customer.setAge(24)
    print(customer.toString())

    println()


    val customerKt = CustomerKt("abdy", "jalana", 10)
    customerKt.name = "abdy"
    customerKt.address = "jaalan raya"
    customerKt.age = 24
    print(customerKt.toString())

    println()

    //object copy

    val customerCopy = customerKt.copy("Malik")
    customerCopy.name.forEach {
        println(it)
    }

    val (age, name, address) = CustomerKt(age = 10, name = "budi", address = "jalan")
    print("$name - $address - $age")

    println()

    //singleton
    print(SingletonKt.property)

    println()

    //type aliases, set type of variable as aliases anything what we want, advantage for more readable code, but this is a little bit confuse  i think

}

 fun printMessage(msg: String)  {
    print("this is message : $msg")
}

fun sum(x: Int, y: Int) = x + y

class OveridingClassExample {
    fun signUp(name: String, password: String, address: String = "", email: String = "") {
        println("Name : $name, Password : $password, Address : $address, email : $email")
    }
}

