fun main(args: Array<String>) {
    var boxer = Boxer("name", 10, 100)
    println(boxer.getName())
}


class Boxer(name: String, power: Int, speed: Int) {
    private var name: String = ""
    private var power: Int? = null
    private var speed: Int = 0

    init {
        this.name = name
        println(name + " - " + power + " - " + speed)
    }

    fun getName():String {

        return name
    }
}