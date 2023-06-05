

/*fun main (){
    val khyber = Car(name = "Khyber", type = "petrol", kmRan = 100)
    val grandi = Car(name = "grandi", type = "diesel", kmRan = 200)
    println(khyber.name)
    println(khyber.type)
    println(grandi.name)
    println(grandi.kmRan)

    khyber.driveCar()
    grandi.driveCar()
}
class Car (val name : String, val type : String, var kmRan : Int)
{
    fun driveCar(){ //methods
        println("$name Car is Driving")
    }
    fun applyBrakes(){
        println("Applied Brakes")
    }
}*/
//---------------------------------------------------------------------
/*fun main(){
    var i : Int = 20
    println(i.plus(30))
    println(i.toFloat())

    val p1 =  person(name = "Rida", age = 22 )
    val p2 =  person(name = "Bilal", age = 18 )

    println(p1.canVote())
    println(p2.canVote())

}
class person(val name: String, var age : Int){
    fun canVote():Boolean{
        return age > 18
    }
}*/
//--------------------------------------------------------------------------------------------------
/*class Lamp {

    // property (data member)
    var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }
    fun displayLightStatus() {
        if (isOn == true)
            println("lamp is on.")
        else
            println(" lamp is off.")
    }
}
*//*fun main(args: Array<String>) {

    val l1 = Lamp() // create l1 object of Lamp class
    val l2 = Lamp() // create l2 object of Lamp class

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
}*//*
//or
fun main(args: Array<String>) {

    val lp = Lamp()
    lp.displayLightStatus()
}*/
//-----------------------------------------------------------------------------
/*class Example (){
    private var number: Int = 5

    fun calculateSquare() : Int {
        return number * number
    }
}
fun main(args: Array<String>) {

    // create obj object of Example class
    val obj = Example()
    println(obj.calculateSquare())
}*/
//------------------------------------------------------------------------------------------------
/*
class Person1(val name: String, val age: Int){
    fun walk(distance:Int){
        println("Person walk ${distance} distance")
    }
}
fun main(args: Array<String>) {

    // create obj object of Example class
    var p1 = Person1(name = "Rida", age=22)
    println("person Detail name : ${p1.name}, age : ${p1.age}")
}*/
//-----------------------------------------------------------------------------------------------------
/*class Account( var acc_no : Int, var name : String, var amount : Float) {

    fun insert() {

        println("Account no: ${acc_no} holder :${name} amount :${amount}")
    }

    fun deposit() {
        //deposite code
    }

    fun withdraw() {
        // withdraw code
    }

    fun checkBalance() {
        //balance check code
    }
}
    fun main(args: Array<String>){
        val ac = Account(acc_no = 8723813, name = "Rida", amount = 1000f)
        ac.insert()
        println(ac.amount)
        println(ac.name) //accessing class property
    }*/
//----------------------------------------------------------------------------------------------
//-----------------KOTLIN NESTED CLASS EXAMPLE---------------------------------------
/*class outerClass{
    private var name: String = "Ashu"
    class nestedClass{
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo(){
            //  print("name is ${name}") // cannot access the outer class member
            println("Id is ${id}")
        }
    }
}
fun main(args: Array<String>){
// nested class must be initialize
    println(outerClass.nestedClass().description) // accessing property
    var obj = outerClass.nestedClass() // object creation
    obj.foo() // access member function
}*/
//-----------------------------KOTLIN INNER CLASS EXAMPLE ----------------------------------------
/*
class outerClass{
    private  var name: String = "Ashu"
    inner class  innerClass{
        var description: String = "code inside inner class"
        private var id: Int = 101
        fun foo(){
            println("name is ${name}") // access the outer class member even private
            println("Id is ${id}")
        }
    }
}
fun main(args: Array<String>){
    println(outerClass().innerClass().description) // accessing property
    var obj = outerClass().innerClass() // object creation
    obj.foo() // access member function

}  */
//----------------------------------------------------------------------------------------------------------
//-----------------------------Most IMP----------------------------------------------
/*class smartDevice(){
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"
    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff(){
        println("Smart device is turned off.")
    }

}
fun main() {
    val sm = smartDevice()
    println("Device name is: ${sm.name}")
    sm.turnOn()
    sm.turnOff()
}*/
//--------------------------------------------------------------------------------------------
/*class Dog (val name: String,
           var weight: Int,
           var height: Int,
           val avgLifeExpectancy: Int){

    fun speak(){
        println("woof")
    }

    fun eat() {
        println("nom nom!")
    }

    fun walk() {
        println("I love walking with my hooman. And occasional zoomies!")
    }
}

fun main(){
    var myDog = Dog(name = "nora", weight = 10, height = 22, avgLifeExpectancy = 10)
    myDog.speak()
    myDog.eat()
    myDog.walk()
    println("${myDog.name} has following properties,")
    println("Weight is ${myDog.weight}")
    println("Height is ${myDog.height}")
    println("Average life expectancy is ${myDog.avgLifeExpectancy}")

}*/
//----------------------------------------------------------------------------------------------------------

/*fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if(numberOfMessages < 100){
        println("you have received $numberOfMessages notification")
    }
    else {
        println("you have received 99+ notifications ")
    }
}*/
//-------------------------------------------------------------------------------------------------------------
/*Exercise 1: Create a Class
Create a class called Person with the following properties:

name (String): Represents the name of the person.
age (Int): Represents the age of the person.
Define a constructor to initialize the name and age properties.
Exercise 2: Add a Method
Add a method called introduce() to the Person class. The method should print a message introducing the person, including their name and age.

Exercise 3: Create Objects
Create two instances of the Person class and assign them to variables. Set different values for the name and age properties of each person.

Exercise 4: Call Methods
Call the introduce() method on both instances of the Person class to introduce each person.

Exercise 5: Create a Class with Computed Property
Create a class called Circle with the following properties:

radius (Double): Represents the radius of the circle.
Define a constructor to initialize the radius property.
Add a computed property called area that calculates and returns the area of the circle (π * radius * radius).
Exercise 6: Create an Object and Access Computed Property
Create an instance of the Circle class and assign it to a variable. Set a value for the radius property of the circle object. Access and print the area property of the circle object.*/
//-------------------------------------------------------------------------------------------------------
/*class person(val name : String, val age : Int){
    fun introduce(){
        println("Hey my name is ${name}  and my age is ${age}  ")
    }

}
class circle(var radius : Double){
    val area: Double
        get() = Math.PI*radius*radius

}
fun main(){
    val p1 = person(name = "Rida", age = 21)
    val p2 = person(name = "Nimra", age = 19)
    val c1 = circle(4.5)
    println(p1.introduce())
    println(p2.introduce())
    println("Radius : ${c1.radius}, Area : ${c1.area}")
}*/
//----------------------------------------------------------------------------------------------------------
/*
class car(val make : String, val model : String, val year : Int){
    fun startEngine(){
        println("Engine has Started $make $model")
    }
    fun stopEngine(){
        println("Engine has Stopped $make $model")
    }

}
class Rectangle(val length : Double, val width: Double ){
    fun calculateArea(): Double{
           return length * width
    }

}
fun main(){
    val c1 =  car(make = "Toyota", model = "Camry", year = 2018)
    val c2 =  car(make = "Honda", model = "Civic", year = 2020)
    val r1 = Rectangle(length = 4.5, width = 2.5)
    val area = r1.calculateArea()
    println("The area of the rectangle is: $area")
    c1.stopEngine()
    c2.startEngine()

};*/
//------------------------------------------------------------------------------------------

/*class Student(val name: String, val age: Int) {
      var grade: String = ""
            get() {
                  return field
            }
            set(value) {
                  field = value
            }
}
fun main(){
      val student = Student("John", 20)
      student.grade = "A" // Assigning "A" as the grade
      println(student.grade) // Output: "A"
}*/
//------------------------------------------------------------------------------------------
//this is an example of assigning properties without constructor
/*class Mobile(){
      var brand: String = ""
      // model of type String
      var model: String = ""
      // mrp of type float
      var mrp: Float = 0f
      // discount of type float
      var discount: Float = 0f
      fun getActualPrice():Float{
            return mrp - discount
      }

      fun printDetails(){
            println("Mobile details:")
            println("Brand: $brand")
            println("Model: $model")
            println("MRP: $mrp")
            println("Discount: $discount")

      }

}*/
/*fun main() {
      val mobile = Mobile()
      mobile.brand = "iPhone"
      mobile.model = "11 pro"
      mobile.mrp = 100000f
      mobile.discount = 1000f

      println("Discounted price is: ${mobile.getActualPrice()}")

      mobile.printDetails()
}*/
//----------------------------------------------------------------------------------------------------------
/*class Student (){
      var ninja_id: Int = 0
      var ninja_name: String = ""

      fun add_details(ninja_id: Int, ninja_name: String){
            this.ninja_id = ninja_id
            this.ninja_name = ninja_name
      }


}
fun main(){
      var obj = Student()

      obj.add_details(1, "Code Studio")

      println("Ninja ID: ${obj.ninja_id}")
      println("Ninja Name: ${obj.ninja_name}")
}*/
//-------------------------------------------------------------------------------------------------------------
/*class Car() {
    var model: String = ""
    var engineNumber: Double = 0.0
    var timetoMaxSpeed: Int = 0

    fun reachMaxSpeedIn(distance: Int) {
        println("Car reach to its Max Speed in ${distance * timetoMaxSpeed}")
    }

    fun printDetails() {
        println("Car is of model :- $model having engine number $engineNumber")
    }
}

class Student(val name: String, val age: Int) {
    var grade: String = "0"
        get() {
            return when (field) {
                in "100" -> "A"
                in "80".."90" -> "B"
                in "70".."80" -> "C"
                in "60".."70" -> "D"
                else -> "F"
            }
        }
        set(value) {
            if (value in "0".."100") {
                field = value
            } else {
                println("Invalid grade! Grade should be between 0 and 100.")
            }
        }
}

fun String.ridaFullName(): String = "$this Salman"
fun main() {

      val student = Student("Rida", 50)
      student.grade = "100"

      val aasdf= 1
      aasdf.toString()
      println("Name: ${student.name.ridaFullName()} - Age: ${student.age} - Grade: ${student.grade}")
//      val audi =  car()
//      audi.model = "Audicode"
//      audi.engineNumber = 395.90
//      audi.timetoMaxSpeed = 30
//
//      audi.


}*/
//-----------------------------------THE END----------------------------------------------------------
/*
open class Parent{
    init {
        println("Parents Constructor is called")
    }
    val name : String = ""
    fun mymethod(){
        println("I am in Parent")
    }
}
class Child : Parent(){
    init {
        println("Child Constructor is called")
    }
    val name2 : String = ""
    fun mymethod2(){
        println("I am in child")
    }
}

fun main() {
    val obj = Child()
}*/
//------------------------------------------------------------------------------------------------------
/*open class Mobile (val type : String)
{
    open val name: String= ""
    open val size :Int  = 5
    fun makeCall() = println("Calling From Mobile")
    fun poweroff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class Oneplus(type1 : String) : Mobile(type1){

    override val name: String = "SDS"
    override val size: Int =  10
    override fun display() {
        super.display()
        println("One plus Display")
    }

    override fun toString(): String {
        return "Name - $name - Size - $size"
    }

}
fun main() {
    val oneplus = Oneplus("fsfsfs")
    oneplus.display()
    println("Name  = ${oneplus.name}")
    val mob = Mobile("sdfsf")
    mob.display()
    println(oneplus.toString())
}*/
//---------------------------------------Inheritence-------------------------------------------\
/*
open class Shape(val color : String){

    open fun draw() = println("Drawing a shape with color : $color")

}
class Circle(color : String, val radius : Double): Shape(color){
     override fun draw() = println("Drawing a circle with radius $radius and color $color")

}
class Rectangle(color : String,val width : Double, val height : Double) : Shape(color){
    override fun draw() = println("Drawing a rectangle with width $width, height $height, and color $color")
}

class Triangle(color : String,val base : Int, val height : Double) : Shape(color){
    override fun draw() = println("Drawing a triangle with base $base, height $height, and color $color")

}
fun main(){
    val obj = Shape("Purple")
    obj.draw()
    val obj1 = Circle("adsa", 4.5)
    obj1.draw()
    val obj2 = Rectangle("fs", 5.5, 4.5)
    obj2.draw()
    val obj3 = Triangle("adad", 5, 3.5)
    obj3.draw()
}*/
//--------------------------------Inheritence-------------------------------------------
/*
open class Vehicle(val make : String, val model : String, val year : Int ){
    fun start() = println("Starting the vehicle")

}

class Car(make : String,model : String,year : Int, val numDoors : Int ) : Vehicle(make, model, year){
    fun drive() = println("Driving the car with $numDoors doors")

}

class MotarCycle(make : String,model : String,year : Int, val hasSidecar : Boolean ) : Vehicle(make, model, year){
    fun ride() = println("Riding the motorcycle" + if (hasSidecar) "with a sidecar" else "")

}
fun main(){
    val obj = Car("toyota", "camry", 2021 , 5)
    obj.start()
    obj.drive()
    val obj1 = MotarCycle("toyota", "camry", 2021 , true)
    obj1.start()
    obj1.ride()
}*/
//---------------------Initialization without Primary Constructor----------------------------------------------------------------------------
/*
open class Animal{
    var name : String = ""
    var age : Int = 0
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    open fun eat() = println("the animal is eating")
}

class Dog : Animal{
    var breed: String = ""
    constructor(name: String, age: Int, breed : String) : super(name, age){
        this.breed = breed
    }

    override fun eat() =  println("The dog is eating")

}
class Cat : Animal{
    var color: String = ""
    constructor(name: String, age: Int, color : String) : super(name, age){
        this.color = color
    }

    override fun eat() =  println("The cat is eating")

}
*/

fun main(){
//    val animal = Animal("sff", 34)
//    animal.eat()
//    val dog = Dog("Dog", 3, "Labrador")
//    dog.eat()
//    val cat = Cat("Cat", 2, "Orange")
//    cat.eat()
    val mehran = Child()
    mehran.color("WHITE")
    mehran.engine("1000")
    mehran.showDetail()
}
//------------------------------------Inheritence with getter and Setter--------------------------
open class Person(var name : String, var age : Int){

    var age1 : Int
        get() = age
        set(value) {
            if (value >=0){
                age =  value
            }
        }

}
class Employee(name: String, age: Int, var salary : Int) : Person(name, age){
    var salary1 : Int
        get() = salary
        set(value) {
            if(value>=0){
                salary = value
            }
        }

}
//class Student(name: String, age: Int) : Person(name, age){
//    var grade : String = ""
//        set(value) {
//            if (value in 0..100) {
//                field = value
//            } else {
//                throw IllegalArgumentException("Grade must be between 0 and 100")
//            }
//        }
//    fun getGrade(): String {
//        return grade
//    }
//}

abstract class Vehicle {

    abstract fun color(color: String)
    abstract fun engine(power: String)
}

open class Engine {

    var power: String = ""
    fun horsePower(power: String){
        this.power = power
    }
}

class Child: Vehicle()  {

    var engine: Engine? = null
    var color: String = ""


    override fun color(color: String) {
        this.color = color
    }

    override fun engine(power: String) {
        engine = Engine()
        engine?.horsePower(power)
    }

    fun showDetail() {
        println("Color: $color - Power: ${engine?.power}")
    }


}
//--------------------------------------------------------------------------------------
