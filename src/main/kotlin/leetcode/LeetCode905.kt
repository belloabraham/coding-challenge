

fun sortByParity(arr:Array<Int>): MutableList<Int> {
    val oddNumbers = mutableListOf<Int>()
    val evenNumber = mutableListOf<Int>()

    for (item in arr){

       if(item % 2 == 0)
            evenNumber.add(item)
        else
            oddNumbers.add(item)
    }
     evenNumber.addAll(oddNumbers)

    return evenNumber
}