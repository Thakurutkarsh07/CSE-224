fun main(){
    //Operators

    var a =5
    var b =4
    val isTrue = true
    val isFalse = false
    val add = a + b
    //arithmetic operators
    println("Sum of $a + $b = ${a+b}")
    println("Multiply of $a * $b = ${a*b}")
    println("Subtraction of $a * $b = ${a-b}")
    println("Division of $a * $b = ${a/b}")
    println("Modulo of $a * $b = ${a%b}")
    //comparison Operators
    val isEqual = a==b
    println("$a == $b: $isEqual")
    println("$a > $b: ${a>b}")
    println("$a >= $b: ${a>=b}")
    println("$a < $b: ${a<b}")
    println("$a >= $b: ${a>=b}")
    println("$a != $b: ${a!=b}")


    //Logical Operators
    val isBothTrue = isTrue && isFalse
    println("Both the value is true: $isBothTrue")
    println("Anyone of the value is true: ${isTrue || isFalse}")



    // Assignment operators
    var sum =3
    sum+=a
    println("Value of sum after adding a to it is:$sum")
    sum-=b
    println("Value of sum after subtracting b to it is:$sum")
    sum*=8
    println("Value of sum after Multiplying 2 to it is:$sum")
    sum/=a
    println("Value of sum after Dividing by 2 to it is:$sum")
    sum%=2
    println("Value of sum after Modulo of 2 to it is:$sum")

    sum = 2
    //Unary Operators
    sum = +sum //Unary Plus
    println("Value of sum :$sum")
    sum = -sum //Unary minus
    println("Value of sum :$sum")
    ++sum
    println("Value of sum :$sum")
    --sum
    println("Value of sum :$sum")

//    println("Value of !a :${!a}")//Not



    //Bitwise Operators
    println("Value of a before shifting to left:$a")
    a.shl(3)
    println("Value of a after shifting to left:$a")
    println("Value of b before shifting to right:$b")
    b.shr(3)
    println("Value of b after shifting to right:$b")

    //Range and iterator Operators



    }