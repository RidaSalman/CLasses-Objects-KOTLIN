import com.sun.tools.attach.AgentInitializationException
import kotlin.time.times

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
class smartDevice(){
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
}
//--------------------------------------------------------------------------------------------
class Dog(
    val name: String,
    var weight: Int,
    var height: Int,
    val avgLifeExpectancy: Int) {

    fun speak() {
        println("woof!")
    }

    fun eat() {
        println("nom nom!")
    }

    fun walk() {
        println("I love walking with my hooman. And occasional zoomies!")
    }
}

fun main() {
    var myDog = Dog(
        name="nora",
        weight=10,
        height=22,
        avgLifeExpectancy=10)

    myDog.speak()
    myDog.eat()
    myDog.walk()
    println("${myDog.name} has following properties,")
    println("Weight is ${myDog.weight}")
    println("Height is ${myDog.height}")
    println("Average life expectancy is ${myDog.avgLifeExpectancy}")
}
//----------------------------------------------------------------------------------------------------------