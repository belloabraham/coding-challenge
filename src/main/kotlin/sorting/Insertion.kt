package sorting

//T=O(n) S = O(1) Not stable
fun insertionSort(array: Array<Int>): Array<Int> {

    for (i in 1 until array.size){
        var currentIndex = i
        val goldenNumber = array[i]
        while (currentIndex > 0 &&  array[currentIndex-1] > goldenNumber){
            array[currentIndex] = array[currentIndex-1]
            --currentIndex
        }
        array[currentIndex] = goldenNumber
    }

    return array
}