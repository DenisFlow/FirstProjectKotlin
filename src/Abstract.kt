fun main(args: Array<String>) {
//    var an = AnimalClass()
    var ta = LionClass()
}

abstract class AnimalClass {
    abstract fun getName(): String

    fun getSpeed(): Int {
        return 2100
    }

}

class LionClass: AnimalClass() {
    override fun getName(): String {
        return "Lion"
    }

    fun getLionSpeed(): Int {
        return super.getSpeed()
    }
}