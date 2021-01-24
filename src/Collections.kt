fun main(args: Array<String>) {
    var x: List<Int> // can't change
    var m: MutableList<String> // can change

    var array = arrayOf(1,2,3,4,4)

    var arrayInt = intArrayOf(1,2,3,4,4)

    var list = listOf<Int>(1,2,3,4,4)

    var mutableList = mutableListOf(1,2,3,4) // can change

    var set = setOf<Int>(1,2,3,43,4,4,4) // duplicates deleted

    println(set.toString())

    var map = mapOf<Int, String>(Pair(1, "a"), Pair(2, "b"))

    println(map.get(1))

    var listNew = set.toList()



}