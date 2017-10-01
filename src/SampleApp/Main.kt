package SampleApp

class TeamApp {
    var teams = ArrayList<Team>()

    fun main() {
        var choosedMenu: Int
        do {
            choosedMenu = menu()
        } while (choosedMenu != -1)
    }

    fun menu(): Int {
        var choosedMenu: Int
        println("Football Team App")
        println("================================")
        println("1. Create Team")
        println("2. View All Team")
        println("3. Search Team (by team name)")
        println("4. Update Team (by team name)")
        println("5. Delete Team (by team name)")
        println("0. EXIT")
        print("Choose : ")
        try {
            choosedMenu = readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            choosedMenu = -1
        }

        when(choosedMenu) {
            1 -> {
                add(Team(1, readLine()!!, readLine()!!, readLine()!!.toInt()))
            }
            2 -> {
                view()
            }
            3 -> {
                search(readLine()!!)
            }
            4 -> {
                update(readLine()!!)
            }
            5 -> {
                delete(readLine()!!)
            }
            0 -> {
                print("Bye")
            }
            else -> {
                println("wrong input!")
            }

        }

        return choosedMenu
    }

    fun add(team: Team) {
        teams.add(team)
    }
    fun view(teamIndex: Int = -1) {
        if(teamIndex == -1) {
            //show all team
            println("List of team")
            teams.forEach {
                printTeam(it)
            }
        } else {
            //show one team
            printTeam(teams[teamIndex])
        }
        println()
        println()
    }
    //TODO: search by all field
    fun search(teamName: String) {
        var teamIndex = getTeamIndexByName(teamName)
        view(teamIndex)
    }

    fun printTeam(team: Team) {
        println("Team Name : ${team.name}")
        println("Description : ${team.desc}")
        println("Throphy : ${team.champ}")
        println("================================")
    }

    fun update(teamName: String) {
        var teamIndex = getTeamIndexByName(teamName)

        teams[teamIndex] = teams[teamIndex].copy(1, readLine()!!, readLine()!!, readLine()!!.toInt())

        view(teamIndex)
    }
    fun delete(teamName: String) {
        var teamIndex = getTeamIndexByName(teamName)
        if(teamIndex != -1) {
            teams.remove(teams[teamIndex])
        }
    }

    fun getTeamIndexByName(teamName: String): Int {
        try {
            var team: Team = teams.filter { s -> s.name == teamName }.single()
            return teams.indexOf(team)
        } catch (e: NoSuchElementException) {
            println("team name not found, search again!")
        }
        return -1
    }
}


fun main(args: Array<String>) {
    TeamApp().main()
}