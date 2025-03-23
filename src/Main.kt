/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   PROJECT NAME HERE
 * Project Author: PROJECT AUTHOR HERE
 * GitHub Repo:    https://github.com/waimea-gkidd/evel-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * **Old gold is a game for two players which consists of 8 coins as well as one gold with 20 places which may hold no more than one coin at a time.
 * The aim is to be the one to get the gold coin out of the game.
 * The coins are placed randomly between these 20 squares.
 * The coins can only move right to left providing there is not another coin in the way (you can not go through other coins)
 * You remove coins by moving them to the last square to the left;
 * if a coin is already on the last square and it's your turn you can decide whether to remove it from the game or not-
 * same goes for the 2nd player for removing a coin.
 * Although you get the choice whether or not to remover a coin if you have no other moves you must.**
 * =====================================================================
 * coinPlacement = cageList
 *
 */

const val numPlacements = 20
const val EMPTY = "---"

fun main() {
    println("Welcome to Old Gold.")
    println("--------------------")
    val playerNum = mutableListOf<String>()

    listPlayers(playerNum)
    println()
    //setPlayerNum.add //create a collection that can be called for listing which players turn it is as well as making them player 1 or 2

    println("In old gold there are only two players")
    val coinPlacement = coinPlacementSetup()

    val playerOne = getString("You'll be player one, please enter your name: ")
    val playerTwo = getString("You'll be player two, please enter your name: ")

    listCoinPlacement(coinPlacement)


    println("")
    //val moves = moveOrder // display the moves in a function collection.

}
fun listPlayers(playerNum: List<String>) {
    println("Cages")
    for (i in 0..< playerNum.size) {
        println("Cage ${i + 1}: ${playerNum[i]}")
    }
}
fun moves()

fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank())
            break

    }
    return userInput

}
fun getPlayerMove(prompt: String): String {}

//fun getPlayerTwoMove(prompt: String): String {}
fun getPlayerMove(cageList: List<String>): Int {
    var move = 0
    for (monkey in cageList) {
        // If cage empty, go to next
        if (monkey == EMPTY) continue
        // Otherwise keep count
        move++
    }
    return move
//    create either a when statement to swap back and forth between players or create a new function for player 2
}

//fun displayGameAndPlayerStatus
fun coinPlacementSetup(): MutableList<String> {
    val coinPlacement = mutableListOf<String>()
    for (i in 1..numPlacements) coinPlacement.add(EMPTY)
    return coinPlacement
}

fun displayGame(coinPlacement: List<String>) {



    val banner = ("+--------".repeat(coinPlacement.size) + "+")

    println(banner)

    for(i in 0 ..<coinPlacement.size) {
        print("| cage ${i + 1} " .padEnd(9))
    }

    println("|")

    println(banner)

    for(i in 0 ..<coinPlacement.size) {
        print("| ${coinPlacement[i]}" .padEnd(9))
    }

    println("|")

    println(banner)

}
fun listCoinPlacement(coinPlacement: List<String>) {
    println("Cages")
    for (i in 0..< coinPlacement.size) {
        println("Cage ${i + 1}: ${coinPlacement[i]}")
    }
}

//fun dataStprage