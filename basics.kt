fun main(){
    //Array of integers
    val numbers = arrayOf(1,2,3,4,5,6)
    println(numbers[0])
    //Array o string
    val words: Array<String> = arrayOf("utkarsh","Pratap","Singh")
    println(words[0])
    //Array of Multiples of 2
    val multiple = Array(8) {i->i*2}
    println(multiple[1])
    //Accessing Elements
    val firstNum = numbers[0]
    val secondWord = words[1]

    println("First number in array: $firstNum")
    println("Second word in array: $secondWord")

    //Modifying Element of Array by index
    numbers[0] = 10
    multiple[0] = 1
    println("First number in array: $firstNum")
    println("First Multiple of 2 in array: ${multiple[0]}")

    //Iterating over Array
    //Using for loop
    for (num in multiple) {
        println(num)
    }
    //2-D Arrays
    val arr = arrayOf(arrayOf(2,2,2,3,4,5),arrayOf(1,2,3,4,5,5),arrayOf(9,8,7,5,2,3))

    val matrix: Array<Array<Int>> = arrayOf(arrayOf(2,2,2,3,4,5),arrayOf(1,2,3,4,5,5),arrayOf(1,2,3,75,72,75))

    println(matrix[1][2])
    println(arr[1][4])
    //Print 2-D Arrays
    for (i in arr) {
        for(j in i) {
            print("$j ")
        }
        println()
    }
}
