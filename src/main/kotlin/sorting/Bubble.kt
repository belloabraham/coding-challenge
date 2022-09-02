package sorting


//T=O(n^2) S = O(1)
fun bubbleSort(array:Array<Int>): Array<Int> {
    for (index in array.indices){
        for (i in 0..(array.size-2)){
            val first = array[i]
            val second = array[i+1]
            if(first > second){
                array[i] = second
                array[i+1] = first
            }
        }
    }
    return array
}