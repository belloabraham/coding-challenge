

fun missingNumb(array: Array<Int>): Int? {

    val sortedArr = array.sorted()

     for (i in sortedArr.indices){
         if(i != sortedArr[i]){
             return i
         }
     }

    return null
}