import java.util.Objects

class Arnold{
    var num:Int=4
    var num2:Int=8


    fun Calculate():Int{
        return num*num2
    }
}

fun main(args: Array<String>) {
    val objc=Arnold()
    println(objc.Calculate())
}