package com.programming.kotlin.chapter03

import java.util.concurrent.SubmissionPublisher

//class people baisc
class People constructor(val name:String , val age:Int, var phoneNumber: Number){
    override fun toString(): String {
        return """The name is : ${this.name}
            |The age is : ${this.age}
            |The number is : ${this.phoneNumber}
        """.trimMargin()
    }
}

//class with bound check - human and notice you can add the modifier here
class Human internal constructor(val name: String, val age: Int, private var phoneNumber: Number?){
    init { //init block add restrictions on the constructor
        require(name.length > 0) {"Your name if empty"}
        require(age < 200) {"You cant be older than 200, your are not human"}
        require(phoneNumber.toString().length <= 10) {"US and CA phone # only"}
    }
    // i can also set the parameter of the class to be private, and only access it via getter
    fun getPhoneNmber():Number?{
        return this.phoneNumber
    }
    // The second constructor
    constructor(name: String,age: Int) : this(name,age,null)

    override fun toString(): String {
        return """The name is : ${this.name}
            |The age is : ${this.age}
            |The number is : ${this.phoneNumber}
        """.trimMargin()
    }
}
// a different way to write the constructor
class Person (name:String,age: Int,phoneNumber: Number){
    private val name = name
    private val age = age
    private val phoneNumber = phoneNumber
    fun getName():String { return this.name} // notice I can use String or Any here
    fun getAge():Any { return this.age }
    fun getPhoneNumber():Any {return this.phoneNumber}
}

//nested class
class Bank constructor(val name:String, staff_amount:Int){
    private class BOA constructor(name: String, staff_amount: Int, address:String){
    // I have setted the inner class to private, thus it can only be accessed within the outer class
    }
}

//static inner class equivlent
class Aclass constructor(name:String,age:Int){
    private var aName = name
    class BstaticClass constructor(val number:Int){
        //this cant access the name, since its private
        //this class is the equivlent to the static
    }
    inner class  CinnerClass constructor(val digits:Int){
        fun printPrivate(){
            println(this@Aclass.aName)
        }
    }
}

//data class -> created just for save data
data class Book(val name: String, val publisher: String, val version: String)



fun main(args: Array<String>) {
    var people1 = People("Jsc Joo",19,3122132222)
    println(people1)
    // var human1 = Human("Xyx Jyj", 201, 31234123412) //exception
    // print(human1)
    // for the human use the second constructor
    var human2 = Human("Shis Shi", 23)
    println(human2)
    var human3 = Human("Xhis Yhi", 26, 3123131232)
    println(human3.getPhoneNmber().toString())
    var person1 = Person("John Johnsons",23,3122133241)
    println(person1.getAge())

    //Access levels
    /*
    1. internal = can create a new instance of your class everywhere within the module
    2. private = the class is only visible in the scope of the file defining it
    3. protected = direct instance creation of the class is not allowed, however, inheritance is allowed, subclass only
     */

}



