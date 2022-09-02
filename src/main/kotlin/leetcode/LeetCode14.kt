import kotlin.math.max

fun mostFreqPrefix(array: Array<String>): String {

    if(array.size < 2)
        return ""

   val prefAndFreq = hashMapOf<String, Int>()

    var maxFreq = 1
    for (item in array){
        var prefix = ""
        var stringLen = 1
        for (char in item){
            if(stringLen <  item.length){
                prefix +=char
                val newFreq = if(prefAndFreq[prefix] == null) 1 else prefAndFreq[prefix]!!.plus(1)
                prefAndFreq[prefix] = newFreq
                maxFreq = if(newFreq > maxFreq) newFreq else maxFreq
            }
            stringLen++
        }
    }

    if(maxFreq == 1)
        return ""

    var stringLen = 0
    var maxPref = ""
    for (item in prefAndFreq){
        if(item.value == maxFreq &&  item.key.length > stringLen){
            stringLen = item.key.length
            maxPref = item.key
        }
    }

    return maxPref
}