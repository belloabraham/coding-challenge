import java.util.*
import kotlin.collections.ArrayList


fun groupAnagram(array: Array<String>): List<ArrayList<String>> {

    if(array.isEmpty())
        return listOf(arrayListOf(""))

    if(array.size == 1)
        return listOf(arrayListOf(array[0]))

    val keyVal = hashMapOf<String, ArrayList<String>>()

    for (item in array){
        val sortedString = item.toCharArray().sortedArray().joinToString("")

        if(keyVal[sortedString] == null)
            keyVal[sortedString] = ArrayList()

        keyVal[sortedString]!!.add(item)
    }

    return  keyVal.values.toList()
}