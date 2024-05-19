fun main(){
    val isActive = true
    if (isActive == true)
    {
        println("yes it is active")
    }
    else
    {
        println("no it is not active")
    }

    val muNum=100
    if (muNum >150)
    {
        println("yeay")
    }
    else if (muNum > 200)
    {
        println("uyo")
    }
    else if (muNum >50)
    {
        println("ok")
    }
    else
    {
        println("all failed")
    }


    //more operators  > < >= <= == !=
    // logical       && ||


    val x= 5
    val y=-4
    val text = if (x>0||y>0){
        println("1st worked")
        "text 1" //this is the value thatw ill be assigned it is always writtten right before the ending bracket
    } else{
        println("2nd worked")
        "text2"
    }    // note else statment is required when assigning a value using if else bcoz the variable needs a value if we only use if it doesnt make sensee coz
        // if the if statemtn fails there is no value to assign
    println(text)



    val t2=if (x<5||y<0) "jai ho" else 5//it first cheks the condition then infers the datatype then assigns thats why
                                                                      // different datatypes work
    // for single expressions only
    println(t2)

val t3=if (x>y) "grater than y" else "smaller than y"
    println(t3)

}