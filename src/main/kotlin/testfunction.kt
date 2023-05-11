import kotlin.math.exp
import kotlin.math.sqrt

fun main(args: Array<String>) {
    calc()
    println(sqrt(45.20))
    println(exp(54.5))
    Myfunction( "Arnold", 21)
    Myfunction( "tailoon", 12)
    Myfunction( "bambi", 20)

}
fun Myfunction(fname:String,Age:Int){

    println("My first name is $fname and am $Age years old")
}
