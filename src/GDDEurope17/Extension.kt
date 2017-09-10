package GDDEurope17

fun main(args: Array<String>) {

    var name = "Abdy Tampan"
    name = name.reverseString()
    print(name)

}

fun String.reverseString(): String {
    var reverse = StringBuffer(this).reverse().toString()
    return reverse
}