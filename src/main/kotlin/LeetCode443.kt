

fun stringCompression(array: Array<Char>): Int {

    if(array.size == 1)
        return 1

    val map = hashMapOf<Char, String?>()

    var sum = 0
    map[array[0]] = ""
    var prevChar = '0'
    for (char in array){
       if(map[char] == null ){ //In the case of a new char
           if(sum>1){
               map[prevChar] = "$sum"
           }else{
               map[prevChar] = null
           }
           sum = 0
           map[char] = ""
       }
        sum++
        prevChar = char
    }

    if(sum>1){
        map[prevChar] = "$sum"
    }else{
        map[prevChar] = null
    }

    var arraySize = 0

    map.toSortedMap()

    for (item in map){
        if(item.value == null){
            array[arraySize] = item.key
            arraySize++
        }else{
            for (i in item.key+item.value!!){
                array[arraySize] = i
                arraySize++
            }
        }
    }

    array.forEach {
        println(it)
    }

    return arraySize
}