package sorting


//T=O(n^2) S = O(1)
fun bubbleSort(array:Array<Int>): Array<Int> {

    for (i in array.indices){
        var nextIndex = i+1
        while (nextIndex < array.size){
            val first = array[i]
            val second = array[nextIndex]
            if(second < first){
                array[i] = second
                array[nextIndex] = first
            }
            nextIndex++
        }
    }

    return array
}