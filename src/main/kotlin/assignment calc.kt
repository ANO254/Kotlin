fun main(args: Array<String>) {
    println("Enter the first number:")
    val num1 = readln()!!.toDouble()

    println("Enter the operation (+,-,*,/)")
    val operator = readln()

    println("Enter the second number:")
    val num2 = readln()!!.toDouble()



    val result = when (operator){
        "+" -> num1+num2
        "-" -> num1-num2
        "*" -> num1*num2
        "/" -> num1/num2
        else -> "Invalid operator"

    }
    println("Result: $result")
}