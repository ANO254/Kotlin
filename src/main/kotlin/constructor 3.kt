class student{
    constructor(name:String,age:Int){
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }

}

fun main(args: Array<String>) {
    val obj=student("Arnold",15)
}