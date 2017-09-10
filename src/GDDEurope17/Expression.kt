package GDDEurope17

fun main(args: Array<String>) {

    //IF ELSE expression
    val paramArgs = if(args.isEmpty()) "100" else args[0]
    val param = paramArgs.toInt()

    val value = if(param == 100) {
        1
    } else if (param > 100) {
        2
    } else {
        3
    }

    //WHEN expression (switch if in java)
    val number = when (value) {
        1 -> {
            print("one")
            1*10
        }
        2, 3 -> {
            print("two or three")
            2*10
        }
        in 3.. 100 -> {
            print("in between 3 until 100")
            3/3
        }
        is Int -> {
            print ("this is an Integer")
            10+2
        }
        else -> {
            print("no")
            0
        }
    }

    println(number)

}