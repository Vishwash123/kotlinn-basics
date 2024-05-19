fun main(){
   print("hello world")
   println("im new")
   println("after ln")
    println("HELLO VISHWASH")
    var randomNumber=1   //var is keyword for variables

    var UserName:String="vishwash"   //here if we declare variable as string we cant store other type of value to it
    // kotlin is statically typed so it checks for types during compile time not run time

    println("Hello $UserName")
    UserName = "john"
    println("hello $UserName")
    val pi=3.14   //val is used for constant varibales cant change its value later
    var age:Int = 20
    println("my age is $age")
   //kotlin has type inference so type specification isnt needed
   var x=30
   var y="jake"
   println("he is $y he is $x years old")
}