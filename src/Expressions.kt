fun main(args: Array<String>) {
    val price = 29

    when(price) {
        !in -10..0 -> println("not minus")
        0 -> println(0)
        1 -> println(1)
        in 2..29 -> println("from 2 to 29")
        else -> println("something else")
    }

    when {
        price <= 29 -> println("+")
        price > 29 -> println("-")
        else -> println("something else")
    }

    var x = when {
        price <= 29 -> 1
        price > 29 -> 2
        else -> 3
    }
    println(x)
}