import kotlin.math.roundToInt

fun main() {

    playNumberGame()
}

fun playNumberGame(defaultPlayerName: String = "Player") {
    println("Default player name is $defaultPlayerName")
    println("Please Enter your Name:")
    val gamerName: String? = readLine()
    val playerName = gamerName.toString()
    if (playerName.isNotEmpty()) {
        println("Hello, $playerName!")
        println("Guess a number between 10 and 20.")
        try {
            val randomNumberHuman: Int? = readLine()?.toInt()
            val randomNumberComputer = (Math.random() * 10) + 10
            if (randomNumberHuman != null ) {
                if (randomNumberHuman < 10 || randomNumberHuman > 20) {
                    println("This Number is NOT between 10 and 20!")
                } else {
                    if (randomNumberHuman == randomNumberComputer.roundToInt()) {
                        println("Congrats! Your guess is right! \n Your guess: $randomNumberHuman \n Computer's number: ${randomNumberComputer.roundToInt()}")
                    } else {
                        println("Sorry! Your guess is wrong! \n Your guess: $randomNumberHuman \n Computer's number: ${randomNumberComputer.roundToInt()}")
                    }
                }
            } else {
                println("You have not entered a number!")
            }
        } catch (e: NumberFormatException) {
            println("This is not a number!")
        }
    } else {
        println("This is not a valid Name:")
    }





}