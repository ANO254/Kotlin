open class shape{
    open fun draw(){
        println("Drawing shape")
    }

}
class circle:shape(){
    override fun draw() {
        println("Drawing a circle")
    }

}
class square:shape(){
    override fun draw() {
        println("Drawing a square")
    }

}
class triangle:shape(){
    override fun draw() {
        println("Drawing a triangle")
    }

}

fun main(args: Array<String>) {
    val shape:Array<shape> = arrayOf(circle(),square(),triangle())
    for (shape in shape){
        shape.draw()

    }
}