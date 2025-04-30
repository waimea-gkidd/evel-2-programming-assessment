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
 * if a coin is already on the last square, and it's your turn you can decide whether to remove it from the game or not- * same goes for the 2nd player for removing a coin.
 * Although you get the choice whether to remover a coin if you have no other moves you must.**
 * =====================================================================
 * coinPlacement = cageList
 *
 */
const val gridLength = 20
const val GOLD_COIN = "GC"
const val SILVER_COIN = "SC"
val SILVER_COINS = List(8) { SILVER_COIN }
val EMPTY_SPACES = List(11) { SPACE }
const val SPACE = "  "


fun main() {
    println("Welcome to Old Gold.")
    println("--------------------")
    val playerNames = mutableListOf<String>()

    setupCoins()

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
            "Removing a coin in the left most square (grid 1) when there is one\n" +
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
            "Remove a coin from the far-left square if one is there")

    val gameBoard = setupBoard()

    gameLoop(gameBoard, playerNames)

}

fun setupBoard(): MutableList<String> {
    val board = mutableListOf<String>()
    board.add(GOLD_COIN)
    board.addAll(SILVER_COINS) //add a function to filter through coins and place them randomly
    board.addAll(EMPTY_SPACES) //add a function to filter through coins and place them randomly
    board.shuffle() // shuffle from kotlin collections
    return board
    /* sets up board with randomised placement of coins and spaces.
    Stolen from monkeys in cages and from kotlin collections
*/
}



fun displayGame(grid: List<String>) { //grids are cages from monkeys in cages
    val banner = "-----".repeat(gridLength)

    println(banner)
    for (i in 0..<gridLength) {
        print("| ${grid[i]} ") // These cages are for the numbers which will be displayed under and will not be moved
    }
    println("|")
    println(banner)
    for (i in 0..<gridLength) {
        print("| ${(i + 1).toString().padStart(2)} ") // These cages are set for the coins which are to be moved
    }
    println("|")
    println(banner)
}

fun userInput(board: MutableList<String>): Boolean { //create moves such as removing coins and moving them left
    val input = getString("Enter the number below the coin you want to move, or 'X' to remove from slot 1: ")

    if (input.uppercase() == "X") {
        if (board[0] == GOLD_COIN) {  // If the player types X, try to remove the coin — only works at far left (position 0)
            board[0] = SPACE //otherwise a removed coin is replaced with a space
            return true // Player wins after removing Gold Coin
        } else {
            board[0] = SPACE
            println("Coin removed from slot 1.")
            return false
        }
    } else {
        val moveFrom = input.toInt()
        val moveTo = getInt("Enter the number below the slot you want to move to: ")
        swapCoins(board, moveFrom, moveTo)
        return false
    }
}

fun swapCoins(board: MutableList<String>, slotNum1: Int, slotNum2: Int) { //stolen from monkey in cages "swapCages" function
    val swap = board[slotNum1 - 1]
    board[slotNum1 - 1] = board[slotNum2 - 1]
    board[slotNum2 - 1] = swap
}

fun gameLoop(board: MutableList<String>, players: List<String>) {
    var currentPlayerIndex = 0

    while (true) {
        val currentPlayer = players[currentPlayerIndex]  // added with tab key from kotlin suggestion
        displayGame(board)

        println("$currentPlayer's turn")

       if (userInput(board)) {
            println("$currentPlayer removed the Gold Coin from slot 1 and has won the game!")
            break // Ends the game when gold coin is removed
        }
        // Move to the next player's turn
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size // added with kotlin suggestions; no clue what this does
    }
}

fun setupCoins(): MutableList<String> { // from monkeys in cages
    val gameLength = mutableListOf<String>()
    for (i in 1..gridLength) gameLength.add(SPACE)
    return gameLength
}

fun getInt(prompt: String): Int { //reworked getString from madlibs
    var intValue: Int?

    while (true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }

    return intValue!!
}

fun getString(prompt: String): String { //From madlibs getString
    var userInput: String
    while (true) {
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput

}





















