package sorting


//T = O(n^2) S = 0(1)
fun quickSort(array: IntArray, startIndex:Int = 0, endIndex:Int = array.size - 1){

    if(startIndex>endIndex)
        return

    val pivot = array[endIndex]

    var leftPointer = startIndex
    var rightPointer = endIndex

    while (leftPointer < rightPointer){
        while (array[leftPointer] <= pivot && leftPointer < rightPointer){
            leftPointer++
        }
        while (array[rightPointer] >= pivot && leftPointer < rightPointer){
            rightPointer--
        }

        val temp = array[leftPointer]
        array[leftPointer] = array[rightPointer]
        array[rightPointer] = temp
    }

    val temp = array[leftPointer]
    array[leftPointer] = array[endIndex]
    array[endIndex] = temp

    quickSort(array, startIndex, leftPointer - 1)
}

