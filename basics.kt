import java.time.MonthDay

fun main() {
//    val temperatur = 25
//    if(temperatur>20) {
//        println("it's a warm day.")
//
//    }
    val score = 85
    if (score >= 90) {
        println("You got A Grade")
    } else if (score >= 80) {
        println("Grade b")
    } else if (score >= 70) {
        println("Grade: C")
    } else {
        println("Grade: D")
    }

//Nested if-else
    val age = 25
    val hasID = true
    if (age >= 18){
        if (hasID){
            "You can enter the club"
        }else{
            println("ID required to enter the club")
        }
    }else{
        println("You cannot enter the club")
    }
    //Calculator
    val a = 5
    val b =10
    val op = "*"
    if (op=="*"){
        println("$a * $b = ${a*b}")
    }else if (op=="/"){
        println("$a / $b = ${a/b}")
    }else if (op == "+"){
        println("$a + $b = ${a+b}")
    }

    ques1()
    whenControl()
    forLoop()
    whileLoop()
    greet("Utkarsh")
}
fun ques1() {
    val age = 19
    if(age<13){
        println("You're a child")
    }else if(age in 13..19){
        println("You're a Teenager")
    }else if(age in 20..64){
        println("You're an adult")
    }else{
        println("You're a senior")
    }

}

fun whenControl(){
    val dayOfWeek = 3
    val dayName = when(dayOfWeek){
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednessday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else-> "Invalid day"
    }

    println("Day of the week: $dayName")

    //'when' as a statement
    val num = 8
    when{
        num%2==0 -> println("Number is even")
        num%2!=0 -> println("Number is odd")
        else -> println("Unexpected Number")
    }

}
fun forLoop() {
    //"For" Loop
    println("For loop of range i -> 2 to 6 6 is excluded")
    for (i in 2 until 6){
        println(i)
    }
    println("For loop of range i -> 2 to 6")

    for (i in 2..6){
        println(i)
    }

    println("For loop of range i -> 6 to 0")
    for (i in 6 downTo 0){
        println(i)
    }

    println("For loop of range i -> 6 to 0 with stepping value")
    for (i in 6 downTo 0 step 2){
        println(i)
    }

    //Iterating over a list
    val fruits = listOf("Apple","Banana","Pineapple","Kiwi")
    for (fruit in fruits){
        println("fruit: $fruit")
    }

//By using index val
    for (index in fruits.indices){
        println("fruit of index $index: ${fruits[index]}")
    }

}

//While Loop
fun whileLoop(){
    var i = 5
    //While loop
    while (i>0){
        println(i)
        i--
    }
    var j = 5
    println()
    //do-While
    do {
        println(j)
        j--
    } while (j>0)
    println()
    do {
        j++
        println(j)
    } while (j<=5)
}

fun greet(name : String){
    println("Hello,$name")
}