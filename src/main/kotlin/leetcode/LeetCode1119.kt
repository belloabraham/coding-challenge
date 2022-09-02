


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

fun isVowel(value: Char): Boolean {
    val char = value.toLowerCase()
    if(char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u')
        return true
    return false
}

