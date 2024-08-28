

fun main() {
//
    println("Enter your name")
    val name = readLine() ?:"Unknown"
    println("Enter your password")
    val password = readLine() ?:""
    val users  = arrayOf(arrayOf("Utkarsh","pass1"),arrayOf("Rahul","pass2"),arrayOf("Raj","pass3"))

    var found = false
    val fahr = readLine()
    val celsius = readLine()


    for(names in users){
        if(names[0]==name && password == names[1]){
            found = true
            break
        }else{
            println("Invalid credentials")
        }
    }
    if(found){
        println("Hello $name. Good to see you Again!")
    }else{
        println("User not found")
    }
    greet("Utkarsh")
//    greetDefault(name)
    sum()
    sum(19+10)
    println("Multiply : 5 x 4 = ${multiply(5,4)}")
}
fun greet(name : String){
    println("Hello,$name")
}

//Default argument
fun greetDefault(name: String = "User"){
    println("Hello,$name")
}

fun sum(a: Int=10,b: Int=20){
    println("Sum of $a + $b is ${a+b}")
}

fun multiply(a: Int,b: Int) : Int{
    val c = a *b
    return c
}

fun celsiusTo(temperature: Int) : Double{
    var fahrenheit = (temperature * 1.8) + 32
    return fahrenheit
}
fun fahrenheit(temperature: Int) : Int{
    var celsius = 5/9 * temperature -32
    return celsius
}
//factorial
//fibonaci series