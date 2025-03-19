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
 */

const val EndTurn = 'X'
val confirmAction = 'A'
val playerOne = '0'
val playerTwo = '1'
fun main() {
    println("Welcome to Old Gold.")
    println("--------------------")
    val playernames = mutableListOf<String>()
    println("In old gold there are only two players")

    val playerOne = getString("You'll be player one, please enter your name: ")
    val playerTwo = getString("You'll be player two, please enter your name: ")

    println("")

}

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
fun getPlayerOneMove(prompt: String): String {}

fun getPlayerTwoMove(prompt: String): String {}

fun displayGameAndPlayerStatus

fun dataStprage