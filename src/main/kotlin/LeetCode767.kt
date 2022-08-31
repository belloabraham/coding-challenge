import java.util.*

fun reOrganizeString(value:String): String {

    if(value.isBlank())
        return ""

    val repeatQueue:Queue<Char> = LinkedList()
    val wordQueue:Queue<Char> = LinkedList()
    for (char in value){
        wordQueue.add(char)
    }

    var orgWord = ""
    while (wordQueue.isNotEmpty()){

        if(repeatQueue.isNotEmpty() &&  !orgWord.endsWith(repeatQueue.peek())){
            orgWord += repeatQueue.remove()
        }else if(!orgWord.endsWith(wordQueue.peek())){
            orgWord += wordQueue.remove()
        }else{
            repeatQueue.add(wordQueue.remove())
        }
    }


    if(repeatQueue.size > 1){
        return  ""
    }else if(repeatQueue.size == 1){
        val last = repeatQueue.remove()
        return if (orgWord.endsWith(last)){
            ""
        }else {
            orgWord.plus(last)
        }
    }

    return orgWord
}