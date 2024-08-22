fun main(){
    //Type Conversion
    val x: Int = 89
    val y: Long = x.toLong()
    println(y)

    //Safe and Unsafe Casting
//    Safe casting by using "as?" it returns null
//     Unsafe casting by using "as"

    val a: Int = 8
    val k: Int = a as Int // Unsafe casting
    val b: String = "hi"
//    val d: Int = b as Int // It will throw ClassCastException

    val c: String? = b as? String // safe casting
    if(c==null){
        println("Safe casting failed")
    }else{
        println("$c")
    }
    }

