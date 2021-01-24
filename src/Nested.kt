fun main(args: Array<String>) {
    var outerAnimal = OuterAnimalClass()
    var nestedLion = OuterAnimalClass.StaticLionClass()
    var innerTiger = OuterAnimalClass().NonStaticTigerClass()

    innerTiger.printAnimalName()
}

class OuterAnimalClass {
    private var animalName: String = "Animal"
    class StaticLionClass {
        fun printAnimalName() {
//            println(animalName)
        }
    }

    inner class NonStaticTigerClass {
        fun printAnimalName() {
            println(animalName)
        }
    }
}

