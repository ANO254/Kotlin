class mimi(val jina:String,val shule:String,val miaka:Int){

}

fun main(args: Array<String>) {
    val myobj=mimi("Arnold","Hill school",2016)
    println("My name is ${myobj.jina} and I schooled at ${myobj.shule} in the year ${myobj.miaka}")
}