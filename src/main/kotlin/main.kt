import java.util.*

fun main(args: Array<String>) {
    val first = listOf(1,2,4)
    val second = listOf(1,3)

    val result = mergeTwoList(first, second)
     result.forEach {
         println(it)
     }

}
