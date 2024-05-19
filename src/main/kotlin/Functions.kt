fun main(){
//    sayHello()
//    sayHello()

    sayHello("Vishwash",20)
    val hasInternet=true
    if (hasInternet){
        getdata("some data")
    }else{
        showMessage()
    }



//    println(getMax(5,9))
    val max=getMax(5,9)
    println(max)

    println(getMax(1,2,3))



    sendMessage("alexa","hello")
    sendMessage("alexa") //showcasing default parmaters
    sendMessage()  //showcasing default parameters
    sendMessage(message="jai mata di")  // named parameters :  irrespective of order





    println(sum(1,2,3,4,5,6,7,8,89,9,0))
    printno(1,231,2,432,5,12,32,42,4,12,23,2)


}

// note : types in functions cant be inferred so we need to specify them
//syntax  : fun func_name(parameter_name : parameter_type,.....) : return type {
// code }

fun sayHello(name : String,age  :Int){
    //age=22    // note pzrmaters are declared a vals so they are immutable chsanging them sdhows an error
    //we need to use another variable to store parameters value and thgen we can change it
//    var num=age
//    num+=1
    println("Hello, $name\nYou are $age years old")
}



fun getdata(data:String){
    println("your data is : $data")
}

fun showMessage(){
    println("no internet connection")
    return
}



fun getMax(a:Int , b: Int) : Int {
//
//    val max = if (a>b) a else b
//    return max
    return if (a>b) a else b
}


fun getMin(a:Int , b:Int) : Int = if (a<b) a else b //for a single expression function i.e. small one operation functions

fun getMax(a:Double , b:Double) :Double = if (a>b) a else b  //function overloading can be dine with diff types of parameters, different no. of psramaeters

fun getMax(a:Int , b:Int , c:Int): Int{
//    if (a>=b && a>=c)
//    {
//        return a
//    }
//    else if (b>=a &&b>=c)
//    {
//        return b
//    }
//    else
//    {
//        return c
//    }

    return  if (a>=b && a>=c)
    {
        a
    }
    else if (b>=a &&b>=c)
    {
        b
    }
    else
    {
        c
    }
}



fun sendMessage(name:String="User" , message: String=sendText()){ //default arguiments can be variables functions and normal values
    println("Name = $name and Message = $message" )
}

fun sendText():String{
    return "some returned default text"

}



//dont need return type in single expressions
//fun sum(a:Int , b:Int , c: Int, d:  Int)= a+b+c+d
fun sum(vararg nums:Int):Int{  //variable arguments : vararg nameforargcontainer : type of values
    var result =0
    for (number in nums){
        result+=number
    }
    return result
}

fun printno(vararg nums:Int){
    nums.forEach{
        println(it)
    }
}