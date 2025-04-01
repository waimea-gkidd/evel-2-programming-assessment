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
fun main() {
    println("Welcome to Old Gold.")
    println("--------------------")
    val playerNames = mutableListOf<String>()

//    listPlayers(playerNum)
//    println()
//    setPlayerNum.add //create a collection that can be called for listing which players turn it is as well as making them player 1 or 2



    // to do: use a remove val and a "Left" and/or right movement to use player input


    println("In old gold there are only two players")

    val playerOne = getString("You'll be player one, please enter your name: ")
    val playerTwo = getString("You'll be player two, please enter your name: ")
    playerNames.add(playerOne)
    playerNames.add(playerTwo)
    println("Player one: $playerOne")
    println("Player two: $playerTwo")
    println("\n" +
            "The rules are:\n" +
            "Players take turns\n" +
            "A turn can be either:\n" +
            "Removing a coin in the left most square when there is one\n" +
            "or \n" +
            "Sliding any coin left\n" +
            "Coins can slide any number of empty squares\n" +
            "Coins cannot jump on or over another coin\n" +
            "Gameplay:\n" +
            "Taking turns, each player can do one of the following:\n" +
            "\n" +
            "Slide any coin a number of spaces to the left, as long as:\n" +
            "Other coins are not jumped\n" +
            "It does not share the same square as another coin\n" +
            "Remove a coin from the far-left square if one is there")  // Rules stolen from ideas.md

    val gameBoard = setupCoins()
    displayGame(gameBoard)

    val coins = mutableListOf<String>()
    val goldCoin = "GC" //0 {getString("There is one gold coin.")}
    val silverCoins = List(8) { "SC" }// 8 silver coins
    val spaces = List(11) { "  " }
    coins.add(goldCoin)
    coins.addAll(silverCoins) //add a function to filter through coins and place them randomly
    coins.addAll(spaces) //add a function to filter through coins and place them randomly
    coins.shuffle()
    println("Shuffled: $coins")
    // To shuffle through the list use the following from kotlin collections:
//    snacks.shuffle()
//    println("shuffled: $snacks")


    println("")
    println("\rCoins have been set up.")
    val move = getPlayerMove("Enter which coin you would like to move: ") // create a string which is able
    println(move) // create game update function


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
fun gameLoop(prompt: String) {} //find code


fun displayGame(coinCages: List<String>) {



    val banner = ("----------".repeat(coinCages.size) + " ")

    println(banner)

    for(i in 0 ..<coinCages.size) {
        print("| coin ${i + 1} " .padEnd(4)) // These cages are set for the coins which are to be moved
    }

    println("|")

    println(banner)

    for(i in 0 ..<coinCages.size) {
        print("| coin ${i + 1} " .padEnd(4)) // These cages are for the numbers which will be displayed under and will not be moved
    }

    println("|")

    println(banner)



}

fun getPlayerMove(prompt: String): String {
    print(prompt)
    return readln()
//    println(readln())
}


/* to do:
        -set a val for data storage and create a function to store user data and update the game at the same time
        -set controls for removing coins as well as moving them left (also add barrier so that use cannot drag coins out of cages)
        -check for a win (if so other player loses) and display a message for results with player names
        -if gold coin is not removed the continue game and swap to other player

        1. create a data storage function. Teacher tips: use arrays/ variables most if not all of which will be global
            write a setupGame() method that puts sensible initial values in these variables, positions on board, ask user
            for data (player names ect)
        2. set controls. inside of player move function controls should be displayed and available to use through the use
            of vals/vars controls consist of removing coins and moving coins to the left.
        3. check for a win. If gold coin is removed then game ends and return results (probably stored in data function)
        4. if gold coin is not removed then continue game swap player and repeat.
        5. for game loop:  for this loop add the functions display, getPlayerInput, updateGame and check for win or loss
        - continue to next player.
        // Loop through the list - from collections
    for (Snack in snacks) {
        println(Snack)
    }



 */


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
