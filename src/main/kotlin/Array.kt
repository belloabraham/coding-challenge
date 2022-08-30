import java.util.*
import kotlin.math.roundToInt


//T = O(n), S = O(1)
fun indexOfItem(array: Array<Int>, target:Int): Array<Int> {

    if(array.isEmpty())
        return arrayOf(-1, -1)

    for (i in array.indices){
        if(array[i] == target) {
            var end = -1
            var d = i
            while (++d < array.size){
                if(array[d]==target)
                    end = d
            }
            return arrayOf(i, end) //Exit loop after the second find
        }
    }

    return arrayOf(-1, -1)
}

