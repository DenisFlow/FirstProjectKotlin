fun main(args: Array<String>) {
    val list = (1..1000).toList()
    val lostfirst10 = list.drop(10)
    println(lostfirst10)
    println(list.take(10))
}