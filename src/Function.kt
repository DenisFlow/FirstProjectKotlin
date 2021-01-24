import java.io.IOException

fun main(args: Array<String>) {

    try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
    } finally {
        println("something")
    }

}



fun getExternalInput():String {
    throw IOException("Could not read external input")
    var x = 0;
}

fun concat(texts: List<String>, separator: String = ",") = texts.joinToString(separator)


fun add(num: Int): Boolean = num > 10

fun permitEntrance(vararg ages: Int): Boolean {
    return ages.any { age -> age >= 18}
}