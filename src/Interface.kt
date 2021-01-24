fun main(args: Array<String>) {
    var myNexus = NexxusClass();
    println(myNexus.getName())
}

interface ComputerInteface {
    fun getName(): String
    fun getRam(): Int
    fun getCPUType(): String
}

class NexxusClass: ComputerInteface {
    override fun getName(): String {
        return("Nexus 6")
    }

    override fun getRam(): Int {
        return 1000
    }

    override fun getCPUType(): String {
        return "String"
    }
}

class iPhoneClass: ComputerInteface {
    override fun getName(): String {
        return("iPhone")
    }

    override fun getRam(): Int {
        return 2000
    }

    override fun getCPUType(): String {
        return "Int"
    }
}
