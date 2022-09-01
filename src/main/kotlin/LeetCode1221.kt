
fun splitBalancedString(value:String): Int {

    var string = ""
    var sumOfBalStrong = 0

    for(item in value){
        string += item
        if(string.length % 2 == 0) {
                val start = string.subSequence(0 until (string.length/2))
                val end = string.takeLast(string.length/2)

                if(start[0] != end[end.length -1]){
                    sumOfBalStrong++
                    string = ""
                }
        }
    }

    return sumOfBalStrong
}