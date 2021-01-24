import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val veryLongList = (1..9999999L).toList()

    var sum = 0L
    var lazySum = 0L

    val nonLazy = measureTimeMillis {
        sum = veryLongList.filter { it > 50 }.map { it * 2 }.take(1000).sum()
    }

    val iLazy = measureTimeMillis {
        lazySum = veryLongList.asSequence().filter { it > 50 }.map { it * 2 }.take(1000).sum()
    }

    println("" + nonLazy + " " + iLazy)
    println("" + sum + " " + lazySum)
}