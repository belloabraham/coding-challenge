import kotlin.math.sqrt

fun isPowerOfTwo(value:Int): Boolean {
    var i = 1
    while (i<value){
        i *= 2
    }
    return i == value
}