

fun singleNumb(array: Array<Int>): Int {
    if(array.isEmpty())
        return -1

    val list = mutableListOf<Int>()

    for (item in array){
        if(list.contains(item)){
            list.remove(item)
        }else{
            list.add(item)
        }
    }

    return list[0]
}