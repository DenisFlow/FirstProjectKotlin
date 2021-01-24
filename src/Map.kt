fun main(args: Array<String>) {
    val list = (1..100).toList()
//    val doubled = list.map { element -> element * 2 }
    val doubled = list.map { it * 2 }
    println(doubled)

    val nestedList = listOf(
            (0..10).toList(),
            (11..20).toList(),
            (21..30).toList()
    )

    println(nestedList)

    val notFlattened = nestedList.map { it.size }
    println(notFlattened)

}