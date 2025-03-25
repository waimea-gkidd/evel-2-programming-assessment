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

const val coinCages = 20
const val EMPTY = " "
const val NUMCOINS = 9
fun main() {
    println("Welcome to Old Gold.")
    println("--------------------")
    val playerNames = mutableListOf<String>()

//    listPlayers(playerNum)
//    println()
//    setPlayerNum.add //create a collection that can be called for listing which players turn it is as well as making them player 1 or 2

    println("In old gold there are only two players")

    val playerOne = getString("You'll be player one, please enter your name: ")
    val playerTwo = getString("You'll be player two, please enter your name: ")
    playerNames.add(playerOne)
    playerNames.add(playerTwo)
    println("Player one: $playerOne")
    println("Player two: $playerTwo")

    val gameBoard = setupCoins()
    displayGame(gameBoard)

    val coins = mutableListOf<String>()
    val goldCoin = 0 {getString("There is one gold coin.")}
    val silverCoins = 1-8 {getString("There are 8 silver coin.")}// 9 silver coins
    coins.add(goldCoin)
    coins.add(silverCoins) //add a function to filter through coins and place them randomly

    // To shuffle through the list use the following from kotlin collections:
//    snacks.shuffle()
//    println("shuffled: $snacks")


    println("")
    val move = getPlayerMove("Enter which coin you would like to move: ") // create a string which is able

}
fun setupCoins(): MutableList<String> {
    val coinSetup = MutableList(coinCages)
    {EMPTY}
    return coinSetup
}

fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}
fun gameLoop(prompt: String) {}


fun displayGame(coinPlacement: List<String>) {



    val banner = ("----------".repeat(coinPlacement.size) + " ")

    println(banner)

    for(i in 0 ..<coinPlacement.size) {
        print("| coin ${i + 1} " .padEnd(4))
    }

    println("|")

    println(banner)


}
fun getPlayerMove(prompt: String): String {
    print(prompt)
    return readln()
}
//    return move
////    create either a when statement to swap back and forth between players or create a new function for player 2
//}
//
//
//
//fun listCoinPlacement(coinPlacement: List<String>) {
//    println("Cages")
//    for (i in 0..< coinPlacement.size) {
//        println("Cage ${i + 1}: ${coinPlacement[i]}")
//    }
//}
//
//fun listPlayers(playerNum: List<String>) {
//    println("Cages")
//    for (i in 0..< playerNum.size) {
//        println("Cage ${i + 1}: ${playerNum[i]}")
//    }
//}
//
//fun dataStprage