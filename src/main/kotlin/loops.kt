fun main(args: Array<String>) {
    //  this is a for loop

    for (i in 5..12){
        println("Loop : $i")
    }
    val myarr= arrayOf("ab","be","cd","ef","gh",1.4)

    for (n in myarr){
        println(n)
    }

    // this is a while loop
    var num =10
    while (num>=0){
        println("Loop : $num")
        num--
    }
    var num2=0
    while (num2>=10)
        println("loop : $num2")
        num2++

    var num3=100

    do{
        println("loop: $num3")
        num3++
    } while (num3<=105)


}