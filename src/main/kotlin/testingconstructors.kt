
//The following is just a test of primary and secondary constructors
fun main() {
 Add(1,2)
}
class Add{
    //calling another secondary constructor using this
    constructor(a:Int, b:Int): this(a,b,7){
        val sumOfTwo = a + b
        println("The sum of 2 is: $sumOfTwo")
    }

    //this executes first
    constructor(a:Int, b:Int, c:Int) {
        val sumOfThree = a + b + c
        println("The sum of 3 is: $sumOfThree")
    }
    init {
        println("This class has 2 secondary constructors that one's called from the other.")
    }
}

