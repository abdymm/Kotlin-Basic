package GDDEurope17.nulls

import GDDEurope17.data.CustomerJava

class NullsKt {
    fun validateCustomer(customer: CustomerJava?) {
        if(customer?.name?.startsWith("A") == true) {
            throw Exception("Names not allowed")
        }
    }
}

fun main(args: Array<String>) {
    NullsKt().validateCustomer(null)
}