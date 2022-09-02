package sorting

//T=O(n^2) S = O(1)
fun selectionSort(array: Array<Int>): Array<Int> {

    for (i in array.indices){
        var lowestValueIndex = i
        var nextIndexAfterI = i+1 //n
        while (nextIndexAfterI < array.size){ //n-1, n-2, n-3, n-4....

            if(array[nextIndexAfterI] < array[lowestValueIndex])
                lowestValueIndex = nextIndexAfterI

            nextIndexAfterI++
        }
        val currentIndexValue = array[i]
        array[i] = array[lowestValueIndex]
        array[lowestValueIndex] = currentIndexValue
    }

    return array
}