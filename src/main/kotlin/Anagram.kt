
// T= O(n) S = O(1)
fun checkIfAnagrams(word:String, word2:String): Boolean {
    if(word.length != word2.length)
        return false

    val first = getKeyAndFreq(word)
    val second = getKeyAndFreq(word2)

    for (n in word){ //T = O(n)
        if (first[n] != second[n])
           return false
    }

    return  true
}

fun getKeyAndFreq(word:String): HashMap<Char, Int> {
    val keyAndFreq = hashMapOf<Char, Int>()
    for (n in word){
        val freq = if(n in keyAndFreq) keyAndFreq[n]!!.plus(1) else 1
        keyAndFreq[n] = freq
    }
    return keyAndFreq
}
