fun main(args: Array<String>) {
    var tig = Tiger();
    tig.fight()
}

open class AnimalX {
    var name: String = ""

    open fun fight() {
        println("rar")
    }


}

class Tiger:AnimalX() {
    override fun fight() {
//        super.fight()
        println("mum")
    }
}