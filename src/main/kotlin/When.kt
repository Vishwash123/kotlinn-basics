fun main(){
    var alarm=11
    when (alarm){
        12,8,9 ->

            {println(" 1 the time is $alarm")}//to cekce whetehr 12 or 8 or 9
        7 -> {println(" 2 the time is $alarm")}
        !in 1..10-> println("it is between 1 and 10 : $alarm") //to check for a range and the condtion will run oppositely if we add !
        14 -> println("the time is $alarm")
        else -> println("the time is $alarm")
    }
    alarm=4
    val text = when (alarm){
        12->{
            "hello mid night"
        }
        4->{
            "wakey wakey"
        }
        else->
        {
            "chla hai kam"
        }
    }
    println(text)
    alarm=2
    val text2 = when {
        alarm<=12->{
            "hello mid night"
        }
        alarm==2->{
            "wakey wakey"//if one is true below ones are omitted
        }
        else->
        {
            "chla hai kam"
        }
    }
    println(text2)
}