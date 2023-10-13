fun main () {
    val person = Person()
    println(person.age)
    person.age = -9
    println(person.age)
}

class Person {
    var age: Int = 30
        get() {
            println("Getting age...")
            if (field < 18) {
                println("Person is underage.")
                return field
            } else {
                println("Person is Over 18")
                return field
            }

        }
        set(value) {
            println("Setting age...")
            if (value > 0) {
                field = value
            } else {
                field = 0
            }
        }
}