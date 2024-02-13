fun main () {
    var StudentOne = Victor("Kekeke", 32547)
}
//class to test calling secondary constructor in a child class from parent class
open class Student {
    constructor (name: String, id: Int, hostel: String) {
        var studentName= name
        var studentId= id
        var studentHostel= hostel
        println("Parent Class Student name is: $studentName, ID is: $studentId and Hostel is: $studentHostel.")
    }
}
class Victor: Student {
    constructor(name: String, id: Int): super(name,id,"Hall 6") {
        var studentName= name
        var studentId= id
        println("Child Class Student name is: $studentName and student ID is: $studentId.")
    }
}