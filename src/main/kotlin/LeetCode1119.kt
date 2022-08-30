


fun removeVowels(value:String): String {

    if(value.isBlank())
        return  value

    var stringWithoutVowel = ""
    for (char in value){
        if(!isVowel(char))
            stringWithoutVowel += char
    }

    return stringWithoutVowel
}

fun isVowel(char: Char): Boolean {
    if(char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u')
        return true
    return false
}