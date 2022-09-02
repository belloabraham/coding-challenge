

fun rangeSum(root: Node, l:Int, r:Int): Int {
    var rangeSum = 0

    val nodes = dFS(root)

    for (item in nodes){
        if(item in (l + 1) until r){
            rangeSum += item
        }
    }
    return rangeSum.plus(l).plus(r)
}

fun dFS(node:Node?): List<Int> {
    if(node == null)
        return emptyList()

    val left = dFS(node.left)
    val right = dFS(node.right)

    return listOf(node.value).plus(left).plus(right)
}
