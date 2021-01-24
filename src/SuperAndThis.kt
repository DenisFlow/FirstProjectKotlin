import javax.swing.Box

fun main(args: Array<String>) {
    var kickboxer = KickBoxer(10, 5, 6, 10);
    kickboxer.fign()
}

open class BoxerX(numberOfMatchesWon: Int) {
    var name:String = ""
    var punchSpeed: Int = 0
    var punchPwer: Int = 0

    fun throwPunch() {
        println("punch")
    }
}

class KickBoxer: BoxerX {
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0

    fun fign() {
        super.throwPunch()
    }

    constructor(a: Int, b: Int, c: Int, numberOfMatchesWon: Int): super(numberOfMatchesWon) {
        this.a = a
        this.b = b
        this.c = c
    }
}