import leetcode.Node

val result = mutableListOf<MutableList<Int>>()

fun pathSumToLeaf(root: Node, target:Int): MutableList<MutableList<Int>> {

    dFS(root, target, mutableListOf())
    return result
}


fun dFS(node:Node, target:Int, paths: MutableList<Int>){

    val targetSum = target - node.value
    paths.add(node.value)

    if(node.left == null && node.right == null && targetSum == 0){
        val pathSum = mutableListOf<Int>()
        pathSum.addAll(paths)
        result.add(pathSum)
    }else{
        if(node.left != null)
            dFS(node.left!!, targetSum, paths)
        if(node.right != null)
            dFS(node.right!!, targetSum, paths)
    }
    paths.remove(paths.size - 1)
}


fun createANodeTree2(): Node {
    val five = Node(5)
    val four = Node(4)
    val eight = Node(8)
    val eleven = Node(11)
    val two = Node(2)
    val seven = Node(7)
    val one = Node(1)
    val thirteen = Node(13)
    val secondFive = Node(5)

    four.left = secondFive
    four.right = one

    eleven.left = seven
    eleven.right = two

    val first4 = Node(4)
    first4.left = eleven

    eight.left = thirteen
    eight.right = four

    five.left = first4
    five.right = eight

    return  five
}