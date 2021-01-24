fun main(args: Array<String>) {
    println(GameStatus.WON)
    println(Feel.BAD)
}

enum class GameStatus {
    WON, LOSS
}

enum class Feel {
    GOOD, BAD
}