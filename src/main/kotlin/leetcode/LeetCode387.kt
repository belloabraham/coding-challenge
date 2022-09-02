

fun nonRepeatingChar(value:String): Int {

    if(value.isBlank())
        return -1

    val hashMap = hashMapOf<Char, Int>()

    for(char in value){
        hashMap[char] = if(hashMap[char] == null ) 1 else hashMap[char]!!.plus(1)
    }

    var index =0
    for (char in value){
        if(hashMap.containsKey(char) && hashMap[char] ==1)
            return index
        index++
    }

    return  -1
}