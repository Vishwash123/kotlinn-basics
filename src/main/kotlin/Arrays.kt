fun main(){
    val names : Array<String> = arrayOf("john","steve","megan")
    val mix = arrayOf(1,2,3,4,5,"vishwash",'a')//type inference
    println(names)//address
    println("first element : ${names[0]}")
    names[0]="alex"
    println("first element : ${names[0]}")
    for (i in names)
    {
        println(i)
    }
println("********************")
    for (i in 0 until names.size)
    {
        println(names[i])
    }

    for (i in mix)
    {
        if (i is Int)
        {
            println(i)
        }
        else
        {
            println("not Int")
        }
    }


    //CHALLENGE
    var chal=arrayOf(12,3,4,56,7,435,34654,35,3424)
    val max = maxel(chal)
    val min= minel(chal)

    println("Maximum value in chal  : $max")
    println("Minimum value in chal  : $min")

    println("********************")
    minormax(chal,3)



    val stringin= readln()//only string input but we can convert to other forms we cana slso take inpput using java utility scannerr which helps us to take
    // input of any type
    println(stringin.toInt())
}


fun maxel(arr:Array<Int>):Int{
    var m=Int.MIN_VALUE
    for (i in arr)
    {
        if (i>m)
        {
            m=i
        }
    }
    return m


}

fun minel(arr:Array<Int>):Int{
    var m=Int.MAX_VALUE
    for (i in arr)
    {
        if (i<m)
        {
            m=i
        }
    }
    return m
}


fun minormax(arr:Array<Int>,choice:Int){
    if (choice ==1)
    {
        println(maxel(arr))
    }
    else if (choice ==2)
    {
        println(minel(arr))
    }
    else
    {
        println("Invalid choice!!")
    }

}