class Students(val name:String,var gender:String,val age:Int){

}

fun main(args: Array<String>) {
    //this is an object
    val myobj=Students("Anold","male",15)
    println("student name is ${myobj.name} and he is a${myobj.gender} of ${myobj.age} years old")

    val myobj2=Students("Ness","male",20)
    println("His name is ${myobj2.name} a ${myobj2.gender} artist aged ${myobj2.age} years old")

    val myobj3=Students("kerry","male",19)
    println("${myobj3.name} is a ${myobj3.gender} athlethe aged ${myobj3.age} years")

    val myobj4=Students("kelly","female",20)
    println("${myobj4.name} is a ${myobj4.gender} singer aged ${myobj4.age}")


    val myobj5=Students("nelly","female",15)
    println("student name is ${myobj5.name} and he is a${myobj5.gender} of ${myobj5.age}")


}