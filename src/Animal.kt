fun main(args: Array<String>) {
    var animal = Animal("tiger", "blue", 100, 130)
    var bee = Animal(100)
}

class Animal (power: Int) {
    init {
        println(power)
    }

    constructor(name: String, color: String, speed: Int, power: Int):this(power) {
        println(name + " - " + color + " - " + speed + " - " + power)
    }
}