fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main(){
    val name = "Widya"

    println(name.hello())

    name.printHello()

    "Lestari".printHello()
}