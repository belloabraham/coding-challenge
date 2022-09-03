package sorting

//T=O(n^2) S = O(1)
fun selectionSort(array: Array<Int>): Array<Int> {
    for (i in array.indices){
        var smallestValueIndex = i
        var nextIndexAfterI = i+1
        while (nextIndexAfterI < array.size){
            if(array[nextIndexAfterI] < array[smallestValueIndex])
                smallestValueIndex = nextIndexAfterI

            nextIndexAfterI++
        }
        val currentIndexValue = array[i]
        array[i] = array[smallestValueIndex]
        array[smallestValueIndex] = currentIndexValue
    }

    return array
}