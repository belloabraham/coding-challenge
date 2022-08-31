

fun coinChange(array: Array<Int>, sum:Int): Int {

    if(array.isEmpty()){
          return  -1
    }

    val sortedArr = array.sorted()
    val size = sortedArr.size - 1
    for (i in size downTo 0){
        val dd = sum  / sortedArr[i]
        var index = i
          if (dd >= 1){
              if(sum % sortedArr[i] == 0)
                  return dd
              while (--index >= 0){
                  if((dd*sortedArr[i] + sortedArr[index]) == sum)
                      return dd+1
              }
          }
    }

    return  -1
}