import kotlin.math.roundToInt

fun main() {
    println("Please Enter your Name:")
    val gamerName: String? = readLine()

    playNumberGame(gamerName.toString())
}

fun playNumberGame(playerName: String = "Player") {
    println("Hello, $playerName!")
    println("Guess a number between 10 and 20.")
    val randomNumberHuman: Int? = readLine()?.toInt()
    val randomNumberComputer = (Math.random() * 10) + 10
    if (randomNumberHuman != null ) {
        if (randomNumberHuman < 10 || randomNumberHuman > 20) {
            println("Please enter a number between 10 and 20:")
        } else {
            if (randomNumberHuman == randomNumberComputer.roundToInt()) {
                println("Congrats! Your guess is right! \n Your guess: $randomNumberHuman \n Computer's number: ${randomNumberComputer.roundToInt()}")
            } else {
                println("Sorry! Your guess is wrong! \n Your guess: $randomNumberHuman \n Computer's number: ${randomNumberComputer.roundToInt()}")
            }
        }
    } else {
        println("Please Enter an Actual Number between 10 & 20:")
    }





}