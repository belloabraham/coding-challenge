fun minimumCost(arr:Array<Int>): Int {
    val sortedArr = arr.sorted()

    var mTC = 0
    for (i in sortedArr.indices){
        var d = i
        var cost = sortedArr[i]
        while (++d < sortedArr.size){
            val second = sortedArr[d]
            cost += second
            mTC += cost
        }
        return mTC
    }

    return mTC
}