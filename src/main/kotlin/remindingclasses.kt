// Classes reminders
class Employee(fName:String, lName: String, yoBirth: Int, dept: String, rle: String) {

    // Properties of class
    var firstName: String = fName
    var lastName: String = lName
    var yearOfBirth: Int = yoBirth
    var department: String = dept
    var role: String = rle

    // Functions/Methods of class
    fun employeeDetails() {
        var age: Int = 2024-yearOfBirth
        println("Name: $firstName $lastName \nAge: $age \nDepartment: $department \nRole: $role")

    }
}

fun main(){
    var victor = Employee("Victor", "Tonui", 1993, "Engineering", "Systems Integration Engineer")
    victor.employeeDetails()

}
