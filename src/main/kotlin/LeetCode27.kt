

fun removeElement(array: Array<Int>, replaceValue:Int): Int {
    var index = 0

    for (item in array){
        if(item != replaceValue)
            array[index] = item
        ++index
    }

    return index
}