fun main(){
    //null means no value and if we try to perform a  mathematical operation using this typf variable it will result in runtime error
    //meaning the programmabe running okay but if we press a button to perform something and it uses a null value variable it might cause an error
    // this type of error only occurs during runtime
    //kotlin counters it yuo cant assign null to a variable by default. all datatypes are non null by default
    //to assign we need special syntax
    val text : String? = null
    println("text :  $text")
    var t2: String? = "hello"
    //println("length : ${t2.length}")//this gives error because t2 may contain null

    //LONG WAY TO TACKLE THIS : TO CHECK NULL
//    if (t2!=null)
//    {
//        println(t2.length)
//
//    }
//    else
//    {
//        println("the variable is null")
//    }

    //SHORTER WAY :
    println(t2?.length)//it doesmthe upper code in one operator it shows nulll if value is null otherwise normal working
    t2=null
    println(t2?.length)
    var t3 : String? = null
   // println(t3!!.length)//only works if null is assigned during declaration
                       //throws null pointer exception if value is null otherwise normally prints length



    var t4= t3 ?: "some text" //if value of variable before operator is null it assign the value on right to the variable otherwise the value of the
                                     // variable is assigned
    println(t4)
    t3="hello"
    t4=t3?:"second text"
    println(t4)
 var t: String? =null
    println(t?.length)
    var demo = t?:"some text"
    println("value : $demo")
}