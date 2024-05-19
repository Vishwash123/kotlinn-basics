fun main(){
    //FOR LOOP


//    for (i in 1..10){
//        println(i)
//    }





//    for (i in 1 until 10){//until excludes 10 i.e ending value also int until left side no. shoould be greater
//        println(i)
//    }

//    for (i in 10 downTo 1){//rwverse count
//        println(i)
//    }
//
//    for (i in 1 until 10 step 2){//step skips specififed amoint of values
//        println(i)
//    }



    //WHILE AND DO WHILE LOOPS :
//    var numbr = 0
//    while (numbr<10){
//        println(numbr)
//        numbr++
//    }


//    var num=0
//    while (num<10) println(num++)
//


//    var demo=0
//    do{
//        println("atleast once irrespective of condition")
//    }
//        while (demo<0)



//    for (i in 1..15){
//        if (i==7)
//        {
//            println("skipped")
//            continue
//        }
//        if (i==9)
//        {
//            println("break / exited")
//            break
//        }
//        println(i)
//    }

//    var d1=0
//    while (d1<20){
//        if (d1==7||d1 in 3..5)
//            {
//                d1++
//                println("skiiipeed")
//                continue
//            }
//        if (d1==15) break //you can use continue similarly
//        println(d1)
//        d1++
//    }


//    var number=0
//    outer@ while (number<5){ //using labels
//        number++
//        println(number)
//        var i=0
//        inner@ while(i<5){
//           // if (i==3) break@outer //break and label in single word
//            if (i==2) break@inner  //note you cant break an inner loop from an outer loop
//            i++
//            println("****$i")
//        }
//    }
//


    //CHALLENGE : CREATE A RANGE OF NO. AND DETERMINE IF AN NO. IS EVEM PRINT IT IF ODD NDONT PRINT AND DISPOLAY TOTAL ODD AND EVEN NOS
    var evenNumbers=0
    var oddNumbers=0
    for (i in 1..100){
        if (isEven(i))
        {
            evenNumbers++
            println(i)
        }
        else
        {
            oddNumbers++
        }

    }

    println("Total number of even no.s in the range are $evenNumbers")
    println("Total number of odd no.s in the range are $oddNumbers")

}


fun isEven(num : Int):Boolean = if (num%2==0 ) true else false