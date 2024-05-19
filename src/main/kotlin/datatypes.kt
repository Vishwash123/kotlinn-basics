import java.security.KeyStore.TrustedCertificateEntry

fun main(){

    var num : Int = 20

    val maxIntegerValue : Int = Int.MAX_VALUE
    val minIntegerValue : Int = Int.MIN_VALUE

    println("INT MAX VALUE IS $maxIntegerValue\nINT MIN VALUE IS $minIntegerValue")


    num = 2147483647 //if we add 1 to this value we get an error coz its the limit
                     //literal is the value assigned to a variable


    val MaxByteValue : Byte = Byte.MAX_VALUE
    val MinByteValue = Byte.MIN_VALUE
    println("BYTE MAX VALUE IS $MaxByteValue\nByte MIN VALUE IS $MinByteValue")


    val maxShort : Short = Short.MAX_VALUE
    val minShort =  Short.MIN_VALUE
    println("Short MAX VALUE IS $maxShort\nshort MIN VALUE IS $minShort")



    val maxLong : Long = Long.MAX_VALUE
    val minLong = Long.MIN_VALUE
    println("Long MAX VALUE IS $maxLong\nLong MIN VALUE IS $minLong")


    val myNum  = 28L  //default data type is integer by defaultif we want it to be byte we need to define it explivitly
                     //uppercase l means long datatype


    val x: Float = Float.MAX_VALUE
    val y  : Float =  Float.MIN_VALUE
    println("Float max value is $x\nFloat min Value is $y")

    //var myFloat : Float = 2.4 //an error occurs because kotlin inferes the type as double and it warns us tata we are storing a double in a float
    val myFloat=2f
    val myFloat2 = 2.4  //note double has no ending identifier like float coz it is automatically ind=fered as the dfault datatype for fractional numbers
    println("Float : $myFloat\nDouble : $myFloat")


    val myChar : Char = 'a'
    println(myChar)

    val myBoolean : Boolean = true
    println("$myBoolean")
    


   var numb:Int=1
    val numbr:Float=2.5f
    val numbr2=2.4
    val value :String="hello"
    val bo:Boolean=true
    val ch:Char='A'
    println("hello $num")



}
