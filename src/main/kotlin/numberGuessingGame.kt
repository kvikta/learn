import kotlin.math.roundToInt

fun main() {

    playNumberGame()  //calling the function to play the game
}

//function defining how to play the game
fun playNumberGame(defaultPlayerName: String = "Player") {
    println("Default player name is $defaultPlayerName")
    println("Please Enter your Name:")
    val gamerName: String? = readLine()   //getting user input entering their name
    val playerName = gamerName.toString()
    if (playerName.isNotEmpty()) {  //checking that the user has not entered an empty name
        println("Hello, $playerName!")
        println("Guess a number between 10 and 20.")
        try {    // handling error and catching to throw exception in case entered value is not a number
            val randomNumberHuman: Int? = readLine()?.toInt()
            val randomNumberComputer = (Math.random() * 10) + 10
            if (randomNumberHuman != null ) {  //if statement to check that entered value is not null
                if (randomNumberHuman < 10 || randomNumberHuman > 20) { //if statement that checks that number is between 10 and 20
                    println("This Number is NOT between 10 and 20!")
                } else {
                    if (randomNumberHuman == randomNumberComputer.roundToInt()) { //comparing entered number with generated number
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