fun main(args: Array<String>) {
    var employee = Employee()
    var person = Person()
}

open class Person() {
    var name: String? = null
    var age: Int? = null
    var height: Int? = null
}

class Student():Person() {
    var studentID: Int? = null
}

class Employee(): Person() {
    var employeeID: Int? = null
}