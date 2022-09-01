

fun defangedIPAdd(ip:String): String {
    val result = StringBuilder()
    for (char in ip){
        result.append(if (char == '.') "[$char]" else char)
    }
    return result.toString()
}