fun main(args: Array<String>) {
    val inputRows = listOf(mapOf("input01.csv" to listOf(3,5,-977,7,11,66)),
            mapOf("input02.csv" to listOf(1,2,3)),
            mapOf("input03.csv" to listOf()),
            mapOf("input04.csv" to listOf(77,7,11,66))
    )

    val cleaned = inputRows.flatMap { it.values }
            .flatten()
            .filter { it in 0..100 }
            .toIntArray()

    println(cleaned.joinToString())

}