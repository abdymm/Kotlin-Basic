package GDDEurope17

typealias Number  = Int

data class FootballPlayer(val name: String, val backNumber: Number)

fun main(args: Array<String>) {
    val footballPlayer = FootballPlayer("Messi", 10)
    println(footballPlayer.name)
    println(footballPlayer.backNumber)
}