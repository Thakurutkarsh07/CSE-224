fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
fun fibonacci(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}
//The Primary Constuctor is a simple concise way to initialiZe class. it is right after the class name;
//the secondary constructor is an additional way to create an object. It's useful when you need to setup the object
class Person{
    var name: String
    var age: Int
    constructor(x: String,y: Int){
        this.name = x
        this.age = y
    }
    constructor(x: String){
        this.name = x
        this.age = 0
    }
    constructor(){
        this.name = "Heena"
        this.age = 32
    }
fun intro(){
    println("My name is $name and age is $age")
}

}

class Person1(var name: String,var age: Int){
    constructor(x: String):this(){
        this.name = x
        this.age = 0
    }
    constructor():this("rahul",50)
    fun intro(){
        println("My name is $name and age is $age")
    }
}

class Student{
    fun result(){
        println("Pending")
    }
}
fun main() {
    //Factorial
    val number = 5
    println("Factorial of $number = ${factorial(number)}")
//Fibonacci Series
    val terms = 10
    println("Fibonacci Series up to $terms terms:")
    for (i in 0 until terms) {
        print("${fibonacci(i)} ")
    }
    //OOPS
    var s1 = Student()
    s1.result()

    var a = Person("Rahul",23)
    a.intro()
    var b = Person("Rahul")
    b.intro()
    var c = Person()
    c.intro()

    var d =Person1("utkarsh",21)
    d.intro()
    var e = Person1("Rohit")
    e.intro()
    var f = Person1()
    f.intro()
    val myRectangle = Rectangle(3.0,5.0)
    myRectangle.display()
    val mySquare = Square(3.0)
    mySquare.display()
}



//base
//base class-->parent
//derive class--> child

open class  Rectangle(val a: Double, val b: Double){
    fun area(): Double{
        return a*b
    }
    open fun display(){
        println("area of rectangle is with dimension $a * $b is ${area()} ")
    }

}
class Square(side: Double):Rectangle(side,side){
    override fun display() {
        println("area of square with side $a is ${area()}")
    }
}
