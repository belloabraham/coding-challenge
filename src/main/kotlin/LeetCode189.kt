

fun mostCommonWord(paragraph:String, bannedWord:Array<String>): String {

    val reg = Regex("[^a-z ]")
    val trimmedParagraph = reg.replace(paragraph.toLowerCase().trim(), "")+ " "

    var word =""
    val map = hashMapOf<String, Int>()
    for (char in trimmedParagraph){
        if(char == ' '){
            if (!bannedWord.contains(word)){
                map[word] = if(map[word] == null) 1 else map[word]!!.plus(1)
            }
            word = ""
        }else{
            word +=char
        }
    }

     val result =   map.maxByOrNull {
         it.value
     }

    return result!!.key
}