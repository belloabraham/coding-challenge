import java.util.*

fun crushTillMax(array: Array<Int>): Array<Int> {

    val stack =  Stack<Int>()

    for (item in array){
        stack.add(item)
    }
    stack.sorted()

    while (stack.size > 1){
        val first = stack.pop()
        val second = stack.pop()
        if(first != second){
            stack.add(first - second)
            stack.sorted()
        }
    }

    return stack.toTypedArray()
}


//[1,1,2,4,7,8]
//[0,2,4,7,8]
//[-2, 4, 7, 8
//[6,7,8]
//[1, 8]
fun crushTillMax2(array: Array<Int>): Array<Int> {

    val pQueue =  PriorityQueue<Int>()

     for (item in array){
         pQueue.add(item)
     }

    for (i in pQueue){
        print(i)
    }
    println()

     while (pQueue.size > 1){
         val first = -pQueue.remove()
         val second = -pQueue.remove()
         if(first != second){
             pQueue.add(first - second)
         }
         pQueue.forEach{
             //print(it)
         }
         println()
     }

    return pQueue.toTypedArray()
}
