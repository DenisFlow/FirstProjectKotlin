fun main(args: Array<String>) {
    val list = listOf("12", "2", "3", "4")
    val containsT = listOf(false, true, false, true)
    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)

    println(zipped)

    val mapping = list.zip(list.map { it.contains("2") })
    println(mapping)
}