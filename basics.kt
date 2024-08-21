fun main(){
    greeting()
    println(name())
    println(greetName("Utkarsh"))//Function calling by passing arguments
}

fun greeting(){
    println("Hello Utkarsh")
}
//Function returning value
fun name(): String{
    val name = "Utkarsh"
    return name
}
//Function having parameter
fun greetName(name: String): String{
    val greet = "Hello $name"
    return greet
}
