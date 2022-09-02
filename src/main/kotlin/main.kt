import sorting.bubbleSort
import sorting.insertionSort

fun main(args: Array<String>) {
    val result = insertionSort(arrayOf(4, 5, 1)) //451
    result.forEach {
        println(it)
    }
}
