import sorting.bubbleSort

fun main(args: Array<String>) {
    val result = bubbleSort(arrayOf(9, 3, 2, 1, 4, 6, 5, 7, 8))
    result.forEach {
        println(it)
    }
}
