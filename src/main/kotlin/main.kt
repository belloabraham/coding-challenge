import sorting.quickSort

fun main(args: Array<String>) {
    val array = intArrayOf(1,4,2,7,3,8,5,9)
   quickSort(array)
    array.forEach {
        println(it)
    }
}
