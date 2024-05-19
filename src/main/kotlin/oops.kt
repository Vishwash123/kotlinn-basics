fun main() {

////    val car1 = Car()//creating an objecxt of class Car
////    car1.name="pagani"
////    car1.model="huyara"
////    car1.color="red"
////    car1.doors=4
////
////    println("Name = ${car1.name}")
////    println("Model = ${car1.model}")
////    println("Color = ${car1.color}")
////    println("Doors = ${car1.doors}")
////
////
////    car1.move()
////    car1.stop()
////
////    println("**********************************")
////
////    val car2 = Car()//creating an objecxt of class Car
////    car2.name="Lamborghini"
////    car2.model="Aventador"
////    car2.color="Yellow"
////    car2.doors=2
////
////    println("Name = ${car2.name}")
////    println("Model = ${car2.model}")
////    println("Color = ${car2.color}")
////    println("Doors = ${car2.doors}")
////
////    car2.move()
////    car2.stop()
////
//
//    //coantructr
////    var car3 = Car("Ford","Mustang","Black",4)
////
////    println("Name = ${car3.name}")
////    println("Model = ${car3.model}")
////    println("Color = ${car3.color}")
////    println("Doors = ${car3.doors}")
////
////    car3.move()
////    car3.stop()
////
////
////
////    val demo_obj=demo(1,"hello"," 3revd                ")
////    demo_obj.show()
//
//
//    println("User 1 : ")
//    var user = User("Vishwash", "Bharti", 20)
//    user.show()
//
//
//    println("***************************")
//    println("User 2 : ")
//    var user2 = User("Wishwash", "Bharti", 20)
//    user2.show()
//
//
//    println("***************************")
//    println("User 23 : ")
//    var user3 = User2("Random", "Dude", 21)
//    user3.show()
//
//
//    println("***************************")
//    println("User 4 : ")
//    var user4 = User2("Random")
//    user4.show()
//
//
//    println("***************************")
//    println("User 5 : ")
//    var user5 = User2("Random", "guy")
//    user5.show()
//
//
//    println("***************************")
//    println("User 6 : ")
//    var user6 = User2()
//    user6.show()
//
//
//    println("***************************")
//    println("User 7 : ")
//    var user7 = User3("V", "b", 19)
//    user7.show()
//
//
//    println("***************************")
//    println("User 8 : ")
//    var user8 = User3("v", "b")
//    user8.show()
//
//
//    println("***************************")
//    println("User 9 : ")
//    var user9 = User3("v")
//    user9.show()
//
//
//    println("***************************")
//    println("User 10 : ")
//    var user10 = User3()
//    user10.show()
//
//
//
//    println("***************************")
//    println("User 11 : ")
//    var user11 = User3(age = 24, lastName = "hb", name = "kate")//named args
//    user11.show()
//
//
//
//    println("***************************")
//    println("User 12 : ")
//    var user12 = u4("Young", "gun", 30)
//    println("name : ${user12.firstName}")
//    println("lastname : ${user12.last}")
//    user12.firstName = "bald"
//
//
//
//    println("***************************")
//    println("User 13 : ")
//    var user13 = u5()
//    user13.firstName = "jefjken"
//    user13.fn = "ffrre"
//    println("${user13.firstName}")
//    println("${user13.fn}")
//
//    println("***************************")
//    println("User 14 : ")
//    var user14 = u6("Vishwash", "bh", 20)
//    user14.favMovie = "Interstellar"
//    println("${user14.favMovie}")
//    //if we dont initialize and then print it shows an error.  its better to have latreinit exception than null pointer exceptions because nullptr
//    //only occur duruing runtime. it will also occur during runtime but we can initialize during runtime
//
//    // late inint only works with classes (non primitive)
//
//    println("\n\n\n\n")
//
//    val calc = Calculator()
//    val result = calc.sum(3, 7)
//    println("sum : $result")
//
//    //to calls um function we need to make an object of calculator everytime to tackle this issue we use companion objects
//
//    println(
//        Calculator2.sum(
//            4,
//            5
//        )
//    )//this makes muc more sense we dont have to create an object to acces sum in calculator
//    //w ecna do same thing for variable
//    println(Calculator2.pi)
//
//
//    //SINGLETON :
////    val instance=database.getInstance()  //we need to get the instance through commpanuion object
////    //since an instqnce doesnt exist it will create an instance andreturn it
////    val instance2=database.getInstance()//since instance alreadye xists it will return the same instance again
////    //in this way we have created a single instance which is available globally no matter how many times we call the function it wil return the same insatcne
////    println(instance)
////    println(instance2)
//// println(Database)//this prints database object address you will see no matter how many times you rpint it
////    //it has same values and init block runs only once during 1st time instance creation
//    //println(Database)
////val db1=Database             //init block is called if objejct is created here if one db object is a;ready crewated no other one is created so
////val db2=Database             //init block runs only once
////println(db1)
////    println(db2)
//    //Lazy initialization :
//
//    val u1 = usr("vishwash", "bharti", 20)
//    val u2 =
//        usr("user", "lname", 20)          //init block runs twice wheneevr bject isc reated since these arent singletons
//    val u3 by lazy {
//        usr("random", "dude", 24)
//    } //init block wasnt called bcoz object will only be initialized when object is used otherwise not so if we print this then its initlialized
//
//    println(u3)//when we used the instance it initialized it thats why  its called lazy initialization
//
//
//    //ENUMS
//
//    println(Direction.WEST)
//    println(Direction.EAST)
//    println(Direction.NORTH)
//    println(Direction.SOUTH)
//    println(Direction.SOUTH.direction)
//    println(Direction.SOUTH.distance)
//
//    for (i in Direction.values()) {
//        println("$i :  ${i.distance} : ${i.direction} : ${i.name}")
//        i.printData()
//    }
//
//    //name variable is a variable builtin in the enum class like values is an builtin array property for enums name represent the name of the value in enums
//
//    val dir = Direction.EAST
//    //val dir2=Direction.valueOf("east") //in real lfe app scenarios the value can come form anywhere so we use valueof to check if value exists
//    val dir3=Direction.valueOf("EAST") //in real lfe app scenarios the value can come form anywhere so we use valueof to check if value exists
//    //in the enum or not and return accordingly IT THROWS EXCEPTION IF VALUE ODESNT EXISTS OTHER WSIE OT REETURN THE VALUE TO THE VARIABLE
//    when(dir){
//        Direction.EAST-> println("The direction is east")
//        Direction.WEST-> println("The direction is west")
//        Direction.SOUTH-> println("The direction is south")
//        Direction.NORTH-> println("The direction is north")
//    }
//    println(dir3)
//
//
//
//    //INNER CLASSES
//    val listview=listView(arrayOf("pencil","rubber","sharpener","pen","box"))
//    listview.listViewitems().displayItem(3)
//
//
//
//
//    //challenege
//
//    val usr1=bankAccount("Vishwash Bharti")
//    usr1.showBalance()
//    usr1.desposit(1000)
//    usr1.showBalance()
//    usr1.withdraw(500)
//    usr1.showBalance()
//    usr1.showTransactionHistory()


    //INHERITANCE

//    val car=car1("bmw","red",1,2)
//    val plane=plane("boeing","white",4,4)
//    car.move()
//    car.stop()
//    plane.move()
//    plane.stop()
//


//val view=View()
//    val button=Button("Log In","Center")
//    val roundButton=RoundButton("Sign Up","Center",30)
//    view.draw()
//    button.draw()
//    roundButton.draw()



//    //SEALED CLASS
//    val success=Success("completed")
//    val error=Result1.Error("failed")
//
//    getdata(success)
//    getdata(error)
//




    //Structural equality
    val name1="Alex"
    val name2="Alexander"
    println(name1==name2)//checking for structural equality checking if they have the same value
    //Referential equality
    println(name1===name1)// === referential equality operator it cheks if variable 1 is at the same refernce as varoable2



    //DATA CLASSES
    val usar1=Usar("vishwash","bharti",20)
    val usar2=Usar("vishwash","bharti",20)
    //println(usar1==usar2)//checking structural equality
    //here we get false because the == operator is overloaded it actually calls the equals function shown below
    //which checks for referentil equality
    // this fucntion is dclared in the any class
   //println (usar1.equals(usar2))//referential equality
    //after overriding
   // println(usar1.equals(usar2))//== operator also works differenlty now

    //the euals fubction and hashcode are linked so if we iverwrite one the other also should be overriden
    //if two objects are comparwd they must have the same hash code

    //before overriding to string
//    println(usar1)   //basically this thing calls to string
//    println(usar1.toString())
    //after overriding
//    println(usar1)

//    //USING DATA KEYWORD
//    println(usar1==usar2)
//    println(usar1.equals(usar2))
//    println(usar1)


    //object expressions :

//   val click=clicklistener()//we can create an instance of the class to use it as an instance
//    val loginButton=Button1("login",1232,click)
    //now if we want another listener for sign up button it will have diferent impleetation if we use a class to do it it will have same code for all
    //so we use object expressions
//    val loginButton=Button1("login",1232,object: OnClickListener{
//        override fun onclick() {
//            //log in
//
//        } })
//    val signUpButton=Button1("signup",1233,object:OnClickListener{
//        override fun onclick() {
//            //sign up
//        }
//    })




    //DELEGATION:
    val user=usar2()
    with(user){
        fName="Vishwash"
        lName="Bharti"
    }
    with(user){
        println(fName)
        println(lName)
    }
}


//note : we camn have classes ina differeent fi;le in same projrct see classes file for all the classes



fun getdata(result:Result1){
    when(result){//when statement must be exhaustive meaning wwe need to cover all possiblites in caseof se aled classes.You can autogenerate it using ide functionality and this feature cant be used for enums
        is Result1.Error -> result.Message()
        is Success -> result.Message() //we can also add else branch but it will be redundant coz we covered all possibilities a;ready else is used to cover remaining possibilities
        is Result1.NonRecoverableError -> result.Message()
        is Result1.recoverableError -> result.Message()
    }
}