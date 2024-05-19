fun main(){
    //LISTS SET MAPS
    //Mutable list set and maps
    //immutable list set and maps
    //LIST :
    val names=listOf("name1","name2","name3")//immutable
    println(names[0])
    var names1=mutableListOf("name1","name2","name3")
    names1.add("name4")
    println("//////////////////////////////////////////////////////")
    names1.forEach{
        println(it)
    }
    names1.remove("name2")
    names1.add("name3")
    println("/////////////////////////////////////////////////////")
    names1.forEach{
        println(it)
    }

    //SET : ONLY UNQIE NO DUPLICATES
    println("/////////////////////////////////////////////////////")
    val nums = setOf(1,1,2,2,3,3,3,4,4,4,4,5)//immutable
    nums.forEach{println(it)}
    println("/////////////////////////////////////////////////////")
    val nums1 = mutableSetOf(1,1,2,2,3,3,3,4,4,4,4,5)
    nums1.add(6)
    println("/////////////////////////////////////////////////////")
    nums1.forEach{println(it)}
    println("/////////////////////////////////////////////////////")
    nums1.remove(2)
    nums1.forEach{println(it)}
    println("/////////////////////////////////////////////////////")

    val u1=Userx("name1")
    val u2=Userx("name2")
    val u3=Userx("name3")
    val u4=Userx("name4")
    val u5=Userx("alex")
    val u6=Userx("alex")
    val obnames = mutableSetOf(u1,u2,u3,u4,u5,u6)
    obnames.forEach{println(it.name)}//duplicate names will be shown bcoz it will use the == operator overloaded in the any class and thus check for referential
                                    // equality. we cna change tjhat using data classes.then duplicate names wont be shown


    //MAPS: KEY VALUE PAIRS
    println("//////////////////////////////////////MAPS////////////////////////////////////////////////")
    val users=mapOf<Int, String>(1 to "maria",2 to "alex",3 to "john")
    println(users[2])
    println("/////////////////////////////////////////////////////")
    val users1=mutableMapOf<Int,String>(1 to "maria",2 to "alex",3 to "john")
    users1.forEach{ t,u->
        println("$t and $u")
    }


    println("/////////////////////////////////////////////////////")
    users1[5]="vishwash"
    users1.forEach{x,y->
        println("$x and $y")
    }
    println("/////////////////////////////////////////////////////")
    users1.remove(2)

    users1[5]="vishwash"
    users1.forEach{x,y->
        println("$x and $y")
    }
    println("/////////////////////////////////////////////////////")
//    nums1.forEach{
//        x->println(x)
//    }

}


/*data*/ class Userx(val name:String){

}