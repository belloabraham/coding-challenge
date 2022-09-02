package sorting

//T=O(n^2) S = O(1)
fun selectionSort(array: Array<Int>): Array<Int> {

    for (i in array.indices){
        var currentArrayIndex = i
        var nextIndexAfterI = i+1 //n
        while (nextIndexAfterI < array.size){ //n-1, n-2, n-3, n-4....

            if(array[nextIndexAfterI] < array[currentArrayIndex])
                currentArrayIndex = nextIndexAfterI

            nextIndexAfterI++
        }
        val currentArrayValue = array[i]
        array[i] = array[currentArrayIndex]
        array[currentArrayIndex] = currentArrayValue
    }

    return array
}