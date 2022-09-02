package sorting

fun insertionSort(array: Array<Int>): Array<Int> {

    for (i in 1 until array.size){             //145
        var currentIndex = i  //541 =551> 451 = 455> 145
        val goldenNumber = array[i]
        //array[currentIndex-1] Previous Item
        //array[currentIndex] CurrentItem
        while (currentIndex > 0 &&  array[currentIndex-1] > goldenNumber){
            array[currentIndex] = array[currentIndex-1]
            --currentIndex //Keep pushing backwards if the latest item is greater
        }
        array[currentIndex] = goldenNumber
    }

    return array
}