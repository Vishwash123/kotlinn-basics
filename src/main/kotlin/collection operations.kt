fun main(){
    //TRANSFORMATIONS  : FUNCTIONS WITH WHICH WE CAN CHANGE A COLLECTION
    //these are lambda fucntions


    //MAPPING
    val nums=mutableSetOf(1,2,3,4,5)
    nums.forEach{println(it)}
    println("////////////////////////")
    println(nums.map { if (it%2==0) it*100 else it*10 })//whatever we write in the code iut appplies to each element of the set but set isnt changed
    nums.forEach{
        println(it)
    }
    println(nums.mapIndexedNotNull{index,value-> if (index==0) null else index*value})
    val nmap=mapOf("key 1" to 1,"key 2" to 2,"key 3" to 3,"key 4" to 4)
    println(nmap.mapKeys{it.key.uppercase()})
    println(nmap.mapValues{it.value + it.key.length})


    //ZIPPING
    val colors=listOf("red","borwn","grey")
    val animals=listOf("fox","bear","hound")
    println(colors.zip(animals))//craetes apirs of same position elements
    println( animals zip colors)


}