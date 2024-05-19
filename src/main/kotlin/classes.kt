import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//class Car{ }  = non construcuot class
//constructor  : primary constructor
class Car(name:String , var model:String ,color:String , doors: Int){//we define the constructor in the class declaration itself
//constructor is a function so we need to specify the type of args
//you need to pass values to constructtor if you  fate one othgerwise erroe occurs
var name=name  //variables cant be uninitialized due to non null proectiom
    // var model=model   //WE CAN declare this variable directly in constructor parameters to make code even shorter the value passed goes direclty into the v
    // variable it works the same
    var color=color
    var doors=doors

//NOTE : PARAMETER VALUE AARE ONLY TO BE ASSIGNED TO SOME VARIABLE THEY DONT CONTAI OR REPRESENT THE STATE OF THE OBJECT SO IF WE DELEETE NAME VARIABLE
// BUT WE JHAVE A PARAMETER NAME THEN IT WILL SHOW AN ERROR BCOZ THE PARAMETER IS JUST A VALUE  TO BE ASSIGNED TO SOME VARIABLE THE VARIABLE IS WHAT GIVES IT
// MEANING



    fun move(){
        println("$name $model is moving")
    }

    fun stop(){
        println("$name $model has stopped")
    }
}

//use constructor if you dont need to check or modify values before assigning them as properties otherwise use normal method to assign properties










class demo(var data1:Int , var data2:String,data3:String){//we cinvcert the parmaeters into properties


    var data3=data3.trim() //by default it erases whitespaces
//    var data4=

    fun show(){
        println("data1 : $data1")
        println("data2 : $data2")
        println("data3 : $data3 hey")
    }
}



//initlializer blocks  :to check and validate before assigning here we only assign name if it starts WITH 'V'
//SO FOR THIS WE FIRST TAKE THAT PROPERTY AS A PARAMETER AND THEN USE INITALIZER BLOCKS  USNG  INUT EYWORD TO VALIDATE AND ASSIGN ACCORDINGLY
class User( name:String, var lastName:String , var age:Int){



    var name:String

    //intializer block

    init{
        if (name.lowercase().startsWith("v"))
            {
                this.name=name  //here during validation it only considers the parmaeter so we need to use thgis keyword
            }
        else{
                this.name="user"
            println("The name doesnt start with 'v' or 'V'")
        }

    }
    //you can have multuple intializer blocks but the order of executuon will be one after other so higehst written first







    fun show(){
        println("Name : $name $lastName")
        println("Age : $age")
    }
}






//SECONDARY CONSTRUCTOR
class User2( var name:String, var lastName:String , var age:Int){

//note we cant declare properties as parameters in secoindary constructor becuae there job is to assign default values if other values arent giveE
    // OR EXECUITE DIFFERENT LINES OF CODE FOR DIFFERENT TYPES OF OBJECTS
    constructor(name:String): this(name,"Default lastname",0)
{
        println("second for 1")
    }//uses the primary constructor signature to assign values
    // this keyword calls the primary constructotr in whgiuch we pass the values taken in the secondarty constructor
    constructor(n:String,lastN:String) : this(n,lastN,0)
    {
        println("second for 2")
    }
    constructor():this("defaultfirst","defaultlasy",0)
    {
        println("second for 0")
    }





    fun show(){
        println("Name : $name $lastName")
        println("Age : $age")
    }
}




///NOTE :  NAMED ARGS AND DEFAULT ARGS CAN ONLY BE USED EWITH PRIMARY CONSTRUCTORS AND NOT SECONDARY

// CONSTRUCTOR WITH DEFAULT PARAMETERS :  if we use secondary cinstructors just for assigning default values in case uyser doesnmt eneter soem  info
// then instead of that we can use default args like as in functions
class User3( var name:String="DEFFIRST", var lastName:String="DEFLAST" , var age:Int=0){







    fun show(){
        println("Name : $name $lastName")
        println("Age : $age")
    }
}




//GETTERS AND SETTERS :  IN KOTLIN THEY ARE IMPLICIT I.E. THEY ARE AUTOMATICALLY GENERATED VERY TIME WE ASSIGN AND RETRIEVE DATA IN CLASSES
// WE ARE DOING IT THROUGH THESE GETTERS AND SETTERS THESE ARE PART OF ENCAPSULATION
//I.E. WE DONT ALLOW DATA TO BE ACCESSED OUTSIDE CLASS DIRECTLY
//BUT WE CAN OVERWRITE THESE GETTERS AND SETETRS TO ADD ADDITIONAL FUNCTIONALITY

class u4(name:String , var last:String , var age : Int){
    var firstName = name

    //these are the implicit codes for the getter and setters
//        get() {
//            return field
//        }
//        set(value){
//            field =  value
//        }

        get(){
            return "First Name : $field"
        }

        set(value){
            println("$value was assigned to firstName")
            field=value
        }



}



class u5(){
    var firstName =""
    var fn=""
    //these are the implicit codes for the getter and setters
//        get() {
//            return field
//        }
//        set(value){
//            field =  value
//        }

        get(){ //getter works everytime we access it
            return "First Name : $field"
            //field identifier :  it represents the last property declared and it is used because if we write fristname=name then syntactically it will
            //call the setter again and which will in turn call the setter again resutying in infinite loop so we write field to tackle this
        }
 //setters works with = operator not with constructor
        set(value){
            println("$value was assigned to firstName")
            field=value //this also only works for last field property in class
        }
//note : field identifier can aonly be called in getter and setters



    //fucntion equivalent t setters and getetr
//    fun setFirstName(name:String){
//        this.firstName=name
//    }
//
//    fun getFirstName():String{
//        return  this.firstName
//    }

    //if we dint have any additional code getetr can be writtten as
    //get()=field
}





//Late init
class u6 (fname:String,lname:String,age:Int) {
    //var favMovie = "" //we cant leave a property uninitialized by default but if we do want to do this we use late init keyword
     lateinit var favMovie:String//note:  we need to assign a tyoe t late init vars
    //if we dont initialize and then print it shows an error.  its better to have latreinit exception than null pointer exceptions because nullptr
    //only occur duruing runtime. it will also occur during runtime but we can initialize during runtime

    // late inint only works with classes (non primitive)

}



//COMPANION OBJECT
//to calls um function we need to make an object of calculator everytime to tackle this issue we use companion objects
class Calculator(){

        fun sum(a:Int , b:Int):Int=a+b

    //fun sum(a:Int , b:Int):Int=a+b
}


class Calculator2(){
    companion object{
        //objects and variables inside compamnion onbjects are called class vars or objects
        //bcoz they oont belong to any sepcific objects like in above class each cakculator object has its own sum fbcntion
        //but here this sum fucnntion belongs to the class annd odesnt need an object to be accessed . if we use an object to acces it error occurs
        fun sum(a:Int , b:Int):Int=a+b
        val pi=3.14
    }
    //now this fucntion sum o
    //fun sum(a:Int , b:Int):Int=a+b
}




//SINGLETON : we want to have one instance of an object and we want it to be globally available eg : if we have a database we want to have only one database
//insatnce and not multiple which may result in redundancy and increase in size


//long way
//class database private constructor(){
//    companion object{// we make the constructor private so that instances cant be created and we uneed to use ocmpanion object so that we can acces values and
//    // prop without needning to craete an instamce
//        private var instance:database ? = null //nullable database instance
//        fun getInstance():database?{
//            if (instance == null){
//                instance = database() //initialize the class inside the class bcoz we cant initialize it outside if no instnxce exists we create one
//            }
//
//                return instance
//
//        }
//
//
//    }
//}


//shorter way

//object Database{//singletons dont have constructor
//    init{
//        println("database created")
//    }
//
//
//}



//LAZY INITIALIZATION : when an object is expansive i.e it takes some time and memory
object Database{//singletons dont have constructor
init{
    println("database created")
}
}



class usr (fname:String,lname:String,age:Int) {

    init{
        println("User $fname was created")
    }

}



//ENUM CLASSES : USED WHEN WE WANT TO REPRESENT FIXED SET OF VALUES WHEN WE CWANT TO CREATE SOME CONSTANTS ETC
enum class Direction(var direction:String,var distance:Int){//CAN ALSO HAVE PROPERTIES
    NORTH("north",10),
    SOUTH("south",20),
    EAST("east",30),
    WEST("West",40);  //these are instances of direction class KEEP THEM IN CAPITAL LETTERS
    //note :  you need to add a semicolon in end of last enum value if you create a function in an enum
    fun printData(){
        println("Direction : $direction and Distance = $distance")
    }
}










//INNER CLASSES : CLASSES INSIDE OTHER CLASSES USED WHEN THEY HAVE CLOSE RELATIONSHIP AND IT IS OF NO USE KEEPPING THEM SEPARATE
class listView(val items:Array<String>){
    inner class listViewitems() {
        fun displayItem(pos:Int){//inner classes can access properties of outer classes
            println(items[pos])
        }
    }
}




//CHALLENGE : CRAEATE A CLASS BANKACC OF A PERSON HAVING 3 PROP ACC NAME BALANCE TRANSACTIONS = MUTABLE LIST CREATE FUCNTIONS
// FOR DEPOSIT IWTHDRAW AND CALCULATING BALANCE ADDCHECKS IF AMOUNT BEING DEPOSITED GREATER THAN 0
class bankAccount(val accName:String="User", private var balance:Int=0){
                private var transactions = mutableListOf<String>()
                fun desposit(amount:Int){
                    if (amount<=0)
                    {
                        println("Please enter a valid amount")
                    }
                    else
                    {
                        println("$amount desposited in the account $accName")
                        println("Balance before deposit : $balance")
                        balance+=amount
                        println("Balance after deposit : $balance")
                        transactions.add("desposited $amount")
                    }
                }

                fun withdraw(amount:Int){
                    if (amount<0)
                    {
                        println("Please enter a valid amount")
                    }
                    else
                    {
                        println("$amount withdrawn from the account $accName")
                        println("Balance before withdrawal : $balance")
                        balance-=amount
                        println("Balance after withdrawal : $balance")
                        transactions.add("withdrawn $amount")
                    }
                }

                 fun showBalance(){
                     println(balance)
                 }

                fun showTransactionHistory(){
                    for (i in transactions)
                    {
                        println(i)
                    }
                }

}



//INHERITANCE : CREATING A CLASS USING ANOTHER ONE NEW CLASS HAS ALL PROPERTIES OF BASE CLASS AND HAVE ADDITIONAL PROPERTIES. THE NEW CLASS IS CALLED DERIVED
// PARENT CLASS IS CALLED BASE OR SUPER CLASS.

//first you need to mark the base class as open. only thrn you can inherit from it
open class vehicle(val name:String , val color: String ){
    open fun move(){//we need to make funcrion wewant ot override open
        println("$name is moving")
    }

    open fun stop(){
        println("$name has stopped")
    }
}
class car1( name : String ,color : String,val engines:Int , val doors:Int):vehicle(name,color){//we need to define the base class so we need to pass value in its
    //constructor for that we need to take the properties as parameters in derived classs but not as properties only as parameters and passs them in base class
    // constructor. we pass the properties common with vehicle to its constructor other ones are new additional properties


    //we can overwrite base class fucntions in derived ones

}


class plane( name:String,color:String,val engines:Int , val doors:Int):vehicle(name,color){

    override fun move() {//use oberrirde keyword to override
        flying()
        super.move()//calling move function from superclass using super keyword
    }

    fun flying(){
        println("The plane is flying")
    }


}


open class View(){
    open fun draw(){
        println("Drawing the view")
    }

}

open class Button(val text:String, val orientation:String):View(){
    override fun draw(){
        println("drawing the button")
        super.draw()
    }
}


open class RoundButton(text:String , orientation:String,val corners:Int):Button(text,orientation){
    override fun draw(){
        println("Drawing the round button")
        super.draw()//it only refers to the class it derives from which is specified after consructor and not the class the paent lass is inheriting from
    }
}






//SEALED CLASSES  : REPRESENT FIXED SET OF POSSIBILITIES LIKE A PROGRAM CAM SUCCEED OR FAIL
//WE MAY THINK JUST USE ENUM BUT ENUMS HAVE LIMITATIONS
enum class Result{
    SUCCESS,
    ERROR();
    //WE CANT DEFINE MORE INFO LIKE IF WE WANT TO ADD DIFFERENT TYPES OF ERROR
}
sealed class Result1(val message : String){
    fun Message(){
        println("RESULT : $message")
    }
    class Error(message:String):Result1(message)//we can define the derived classes inside or outisde sealed class
    //class Success(message:String):Result1(message)
    class recoverableError(exception:Exception,message:String):Result1(message)
    class NonRecoverableError(exception:Exception,message:String):Result1(message)
}
class Success(message:String):Result1(message)






//ABSTRACT CLASSES : SIMILAR OT INTERAFCXES WE CAN DECLAREE PROPERTIES WHICH WE CAN MODIFY IN  OTHER CLSASSES. THEY ARE ONLY CREATED TO BE INHERITED BY OTHER CLASSES YOU CANT CREATE INSTANCES OF IT
//Used with APIs . We just define functions as abstarct in abstarct classes and api  will generate code automativally afterwards
abstract class vehicleAbs{    //we can have properties in abstract classes buit in interfaces we cant
    //we can make as may interfaces we want but we can only inherit from a single abstarct class
    var speed=0
    abstract fun move()
        //no body just define

    abstract fun stop()   //need to make the functionns abstract too
}


class car2(var name: String,var color: String,val engines: Int,val doors: Int):vehicleAbs(){
    //even if we dont defne constructor you do need to call it during inheritance
    override fun move() {
        println("$name is moving")
    }

    override fun stop() {
        println("$name has stopped")
    }

}





//DATA CLASSES :
//impplipcitly there  is a class named ANY and evryclass we create inherits from any class impplicitly
//implicilty the below code is actually :
// class Usar(var fName:String,var lName:String,var age:Int):Any()


//class Usar(var fName:String,var lName:String,var age:Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//        if (other is Usar) {
//            return this.fName == other.fName && this.lName == other.lName && this.age == other.age
//        }
//
//        return false
//
//
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//
//    override fun toString(): String {
//        //return "jai ho"
//        return "Usar(firstName = $fName , lastName = $lName , age = $age )"
//    }
//}

//now instead of doinf all this we can jsut use data classes
//all the properties declared inside the primary constructor are used in the data class implementation
//so if you want tonomit a property from the implementation just declare it inside the class
//you can check it by pritning it
//note : data class can only have properies i the prmary constructor and  not parameters
//data classes automatically impement the overriden implemetation of equals,hashcide,tostring,copy and component functions
data class Usar(var fName:String,var lName:String,var age:Int) {

    //above code will automaticALLY BE IMPKEMENTED INSIDE DATA CLASSES
}



//INTERFACES : USED WHERN YOU WANT DIFFERENT CLASSES TO DSHARE COMMONLY USED BEHAVIOUR WITHOUT PRIVIDING THAT CODE YOU ON;Y DEFUINE BNANE AND PARAMETERS AND FUCNTION
//EG :  CAR PLANE BUS ALL START ENGINE BUT WE DONT KNOW HOW THEYLL START ENGINE WE DONT CARE WHAT CODE GOES IN THIS FUNCION BUT WE KNOW THAT THEY DO THE SAME THING
//WE DEFINE THE WHAT AND NOT HOW

interface Engine {
    fun startEngine()//we only define that claases will start the enghine how they do it depends onthem
    //fun move()
}//dont have constructors

class icar(var name:String,var color:String):Engine{
    //if you use an interface you must override all its functions
    override fun startEngine() {
        println("$color $name starting engine to drive")
    }
}

class iplane(var name:String,var color:String):Engine{
    override fun startEngine() {
        println("$color $name starting engines to fly")
    }
}

class itruck(var name:String,var color:String):Engine{
    override fun startEngine() {
        println("$color $name starting engine to drive as well")
    }
}

class tesla(val name :String , val color:String):Engine{
    override fun startEngine() {
        println("tesla startring vroom")
    }

}



//OBJECT EXPRESSIONS :
class Button1(val text:String,val id:Int,onClickListener:OnClickListener)//here a onclicklistner onterface will be passsed but we cant instatiate an interface
    class clicklistener():OnClickListener{
    override fun onclick() {

    }
    }

interface OnClickListener{//interface made by us
        fun onclick()
    }


//to tackle this problem we create a spearatr class to implement it

//now if we want another listener for sign up button it will have diferent impleetation if we use a class to do it it will have same code for all
//so we use object expressions



//DELEGATION : giuving authority from one instance.class to another when inheritance starts to break. if you want to iherit from multiple classes you cant thats where delegation comes in
//class App():firstDelegate(),secondDelegate(){
//    shows error bcoz multiple inheritance isnt allowed
//}
//with delegation we can plugin multiuple implementations in our class
class App() : A by firstDelegate(),B by secondDelegate(){
    //means it uses implementation of A done in firstdelegate and b done in secind deleghate

    override fun print() {

    }

    override fun print2() {

    }
}





interface A{
    fun print()
}

interface B{
    fun print2()
}


open class firstDelegate():A{
    override fun print() {

    }
}

open class secondDelegate():B{
    override fun print2() {

    }
}



class usar2{
    var fName by FormatDelegate()
    var lName by FormatDelegate()
}

class FormatDelegate:ReadWriteProperty<Any?,String>{
    private var formattedString:String=""
    override fun getValue(thisRef: Any?, property: KProperty<*>): String{
        println("delegation getter")
            return formattedString
        }




    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("delegation setter")
        formattedString=value.lowercase()
    }
}