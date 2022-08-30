import java.util.*


fun reverseVowelInString(value:String): String {

    if(value.isBlank())
        return value

   val stack = Stack<Char>()

    for (char in value){
      if(isVowel(char))
          stack.push(char)
    }

    var newString = ""

    for (char in value){
        newString +=  if(isVowel(char)) stack.pop() else char
    }

    return  newString

}