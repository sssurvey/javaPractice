package com.programming.kotlin.chapter01 //package

// import examples
// same as java, and here is wild card example
import com.programming.kotlin.chapter01.*
import java.io.File
import java.io.FileNotFoundException
import java.util.*

// imported and used it in main, a val called PI, example
// it is also possible to rename the import like python
// i.e: import com.packt.adsf.asdfasf as MyImport

class Foo{ // this class can be refered as com.programming.kotlin.chapter01.Foo
    fun fooboo(){
        println("You Rang?")
    }
}

// and this top level function can be refered as com.programming.kotlin.chapter01.top_level_function
fun top_level_function() : String{ //string is specified return
    val myTopString = "MULTIPASS"
    return myTopString
}


fun main(args: Array<String>) {
    println("Hello World!")
    val my_string = "name"
    var my_integer = 1
    // the difference between my_string and my_integer is that val is immutable, and var is mutable
    var my_string_1: String
    // my_string_1 right now cant be used, since not init
    // print(my_string_1)
    my_string_1 = "my name is string"
    println(my_string_1)

    fun hello_world() = println("one line hello!")
    hello_world()

    fun plusOne(x: Int) = x + 1 //returns x, and x = x+1
    var plusOne_result = plusOne(3)
    println(plusOne_result)

    // var declare demos
    var float_demo = 0.1232131F
    var long_demo = 23123123L
    var hexNumbers = 0x1312abc
    var binNumbers = 0b0101010
    println(float_demo)

    val explicit_demo: Number = 123.1 //equals to int my_num = 123.1

    // in kotlin everything is an object
    // and the type of numbers in kotlin is: Long, int, Short, Byte, Double, Float

    // convert numbers
    var int = 123
    var long = int.toLong()
    // some more examples
    var change = 123
    var resultOfChange = change.toLong()
    // more: toByte, toShort, toInt, toLong, toFloat, toDouble, toChar

    //bit manipulation
    val ls = 1 shl (2)
    val rs = 1 shr 2 // can also do this
    val unsinged_rs = 1 ushr (2)

    val and = 1 and (0b0001010101)
    val demoAnd = 1.and(3) //also works
    val or = 1 or 0b001010101
    val xor = 1 xor 0b10101101
    // invert, notice the dot notation, if only one value is involved, then use the dot notation
    val inv = 1.inv()

    // some boolean operations
    val x = 1
    val y = 2
    val z = 2
    val isTrue = x < y && x < z
    val alsoTrue = x == y || y == z

    // char, and this is different from java, the char here is not treated as a number
    // and support escaping
    var char1 = "a\n"
    var char2 = "\t"
    var char3 = "c"
    var char4 = "\u1234\n"
    print(char1);print(char2);print(char3);print(char4)

    // strings
    val string = "String with \n new line"
    val rawString = """adsfasdfhaskfhsafkasjdfaslkfa
        |sadflsajfklsajflasdjflkasjfasf
        |adsfaslfjaslkdfjasljflkasjdlkfjkasdfjas
        |fdasfljsadkfljasldjflksajflkasjdlfkjas
        |look at this, raw string can be used for long strings
    """.trimMargin()

    // string templates
    val a_string = "name"
    val b_string = "my "
    println(b_string + a_string + " is sdafsafasf") // same as java
    val c_string = "$b_string$a_string" //simply call by using $
    // can also add expression
    println("This is your $a_string, and it haha, it is ${a_string.length} chars")
    println(c_string)

    // arrays
    val array = arrayOf(1, 2, 3)
    val perfect_squares = Array(10, { k -> k * k })
    // generate an arr with length == 10, and each element is indexCount*indexCount
    println(perfect_squares.get(9))
    perfect_squares.set(0, 99999)
    println(perfect_squares.get(0))

    var element1 = array[2]
    println(element1)
    array[2] = 8888
    element1 = array[2]
    println(element1)
    // the array can have multiple type of obj
    val array2 = arrayOf("a", "asdfsa", 9.1, 213)
    println(array2[2])
    // kotlin also provided specialized arrays:
    // ByteArray, CharArray, ShortArray, IntArray, LongArray, BooleanArray, FloatArray, DoubleArray

    // Comment

    /* block
       block
       block comments
     */
    // import demo below
    println(PI)

    // range
    val aToz = "a".."z"
    val OnetoNi = 1..9
    println("${"c" in aToz}")
    println("${3 in OnetoNi}")

    val countingDown = 100.downTo(0)
    val countingUp = 0.rangeTo(100)

    val oneTo50 = 1..50
    val oneTo50increaseBy2 = oneTo50.step(2)

    //can also do the reverse range
    val reversedRange = 0.rangeTo(100).step(3).reversed()
    println(reversedRange)

    // loop demo
    for (i in reversedRange) {
        print(i.toString() + " ")
    }

    for (k in 1..50) {
        print(k)
    }

    val list = listOf(1, 2, 3, 4, 5)
    for (i in list) {
        print(i)
    }

    // as long as the object has an iterator, this for loop works
    val set = setOf(1, 2, 3, 4)
    for (i in set) {
        print(i)
    }

    // double loops
    for (i in (1..10).step(2)) {
        for (k in 1.rangeTo(10)) {
            println("outer is -> ${i.toString()} \n and inner is --> " + k.toString())
        }
    }

    // as long as there is hasnext and next and they return boolean or T, note T is type in kotlin
    // the for loop can work on them
    val loop_string = "adsfffffffffffffffffffffffffaddfasfasfsafasdfasd"
    var loop_char_list = mutableListOf<Char>()
    for (char in loop_string) {
        loop_char_list.add(char)
    }
    println(loop_char_list.toString())

    // indice of array
    for (index in loop_char_list.indices) {
        println(index.toString() + " ")
    }

    // exceptions - all the exceptions in the kotlin is unchecked
    fun exception_demo() {
        var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        for (arr_index in arr.indices) {
            try {
                print(arr[arr_index + 2])
            } catch (e: IndexOutOfBoundsException) {
                print("check your fun it is : IOBE\n")
                break
            }
        }
    }
    exception_demo()
    // in the meantime it is like java, a finally block can be implemented too

    // instantiating classes
    try {
        val file = File("./readme.txt")
    } catch (e: FileNotFoundException) {
        println("the readme.txt file is not found")
    }

    val importedclass = ImportedClass() // instance created
    println(importedclass.my_class_string)

    //reference location comparison
    val a = 123
    val b = 123
    var a_b_reference_locationSame = a === b
    println(a_b_reference_locationSame)
    var a_b_value_compare = a == b
    println(a_b_value_compare)

    //the "this"
    class testClass(name: String) {
        var ppl_name = name
        fun printName() = println(this.ppl_name)
    }

    var ppl = testClass("JOON")
    ppl.printName()

    class Building(val address: String) {
        inner class Reception(tel: String) {
            fun printAddress() = println(this@Building.address)
        }
    }

    val test_building = Building("3333 S state st")
    test_building.Reception("3333333333").printAddress()

    // modifiers
    class TesterClass(testString: String, testInt: Int) {
        private var instaceString = testString
        public var instanceInt = testInt
    }

    var testerClass = TesterClass("sdfasdasf", 32134)
    // println(testerClass.instanceString) this will not work
    println(testerClass.instanceInt)
    /*
    modifier list:
        1. protected
        2. private
        3. internal // this is like the default, i think -> module private
     */

    //if -- in kotlin the if..else, try..catch are expressions, they can directly assign value, return etc..
    val date = Date()
    val today = if (date.year == 2018) true else false
    // another example
    fun isZero(x: Int): Boolean {
        return if (x == 0) true else false
    }
    println(isZero(3))
    // lastly
    /*
    val success = try {readFile() true} catch(e:IOException){ falsex}
     */
    //ref: to the book pdf page 62

    //NULL syntax -- simplified
    var my_string_null: String? = null
    fun isString(any: Any): Boolean {
        return if (any is String) true else false
    }
    println(isString(date))

    // smart cast
    fun printStringLength(any: Any) {
        if (any is String) println(any.length) else println("Not a string")
        // notice here I called any.length, instead of string.length? this is because of the
        // smart cast, since this if will only be reached if any is string
    }
    printStringLength("adsfasfsafds")
    // another example of smart cast
    fun testifString(any: Any) {
        if (any is String && any.length != 0) true else false
    }

    //explicit casting
    fun length_fun(any: Any): Int {
        val string = any as String // any as String, this is like the Integer(any) in java
        return string.length
    }

    // with null considered, explicity casting
    fun length_fun_2(any: Any):Int{
        val string: String? = any as String
        return if (string != null) {
            return string.length
        } else -1
    }

    // the When expression, this is comparable to the switch
    // two approaches
    // java type
    fun whatNumber_java_style(x:Int){
        when (x) {
            0 -> println("x is zero")
            1 -> println("x is one")
            2 -> println("x is two")
            else -> println("x is they, and they live")
            // the else is like the default
        }
    }

    // more when
    fun isMinOrMax(x: Int) : Boolean{
        val isZero = when(x){
            Int.MIN_VALUE -> true
            Int.MAX_VALUE -> true
            -1,0,1 -> false // multi-case can be grouped to 1
            else -> false
        }
        // when ended -> assign to isZero -> return isZero
        return isZero
    }

    // more when
    fun isAbs(x:Int):Boolean{
        return when (x){
            Math.abs(x) -> true
            // notice the operation here, howver, only if the operation return the same type
            in listOf<Int>(1,2,3,4,5) -> true
            in 40..50 -> true
            else -> false
        }
    }

    // more, when, smartcast
    fun checkStart(any: Any):Boolean{
        return when(any){
            is String -> any.startsWith("adsfas")
            else -> false
        }
    }

    println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    // when, the second form
    fun whenWithoutArgs(x: Int, y: Int){
        when{
            x < y -> println("x is less than y")
            x > y -> println("x is greater than y")
            else -> println("x must equals to y")
        }
    }

    // function return
    fun addTwoNumber(a: Int, b:Int): Int{
        return a+b
    }; println(addTwoNumber(3,2))
    // function return inner most
    fun largestNum(a:Int,b:Int,c:Int):Int{
        fun largest(a:Int,b:Int):Int{
            if(a>b) return a else return b
        }
        return largest(largest(a,b),largest(b,c))
    }; println(largestNum(3,4,5))

    fun printLessThanTwo() {
        val list = listOf(1,2,3,4)
        list.forEach(fun(x){
            if(x<2) println(x) else return
        })
        println("This line will still execute")
    }; printLessThanTwo()

    fun printUntilStop(){
        val list = listOf("a", "b", "stop", "c")
        list.forEach mytag@ {
            if (it == "stop") return@mytag
            else print(it)
        }
    }; printUntilStop()

    fun printUntilStop2(){
        val list = listOf("a","b","stop","c")
        list.forEach{
            if(it == "stop") return@forEach
            else print(it)
        }
    }; printUntilStop2()

    //Type hierarchy
    /*
    --TOP-----
    "Any" ~~ Object
    "Unit" ~~ Void
    --BOTTOM--
    "Nothing" -- This is the subcalss of all type
     */





}


