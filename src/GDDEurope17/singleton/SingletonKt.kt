package GDDEurope17.singleton

object SingletonKt {
    val property = "beuh"
}

fun main(args: Array<String>) {
    //java
    print(SingletonJava.getInstance().property)
    //kotlin
    print(SingletonKt.property)
}