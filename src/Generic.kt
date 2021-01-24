fun main(args: Array<String>) {
    var myAnimal = GenericAnimalClass("Lion")
    var hisAnimal = GenericAnimalClass(10)
}

class GenericAnimalClass<T>(kind: T) {
    init {
        println(kind)
    }
}