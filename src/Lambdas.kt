fun main(args: Array<String>) {
    val timesTwo = {x: Int -> x*2}
    val add: (Int, Int) -> Int = {x: Int, y: Int -> x + y}
    val list = (1..100).toList()

    println(list.filter( {element -> element % 2 == 0}))
    println(list.filter( {it % 2 == 0}))
    println(list.filter( {it.even()}))
    println(list.filter{it.even()})
    println(list.filter(::isEven))

    println(timesTwo(2))
    println(add(1,4))
}

fun Int.even() = this % 2 == 0

fun isEven(i: Int) = i % 2 == 0