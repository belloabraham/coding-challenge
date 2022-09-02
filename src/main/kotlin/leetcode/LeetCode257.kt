package leetcode
class Node(val value:Int, var left:Node? = null, var right:Node? = null)

fun rootToLeaf(root:Node?): Array<String> {

    if(root == null)
        return emptyArray()

    val leftPath = depthFirstReversal(root.left)
    val rightPath = depthFirstReversal(root.right)

    return  arrayOf("${root.value}".plus(leftPath), "${root.value}".plus(rightPath))
}

fun depthFirstReversal(node:Node?): String {
    //Break condition
    if(node==null)
        return ""

    //Recursion with Next value
    val rightList  = depthFirstReversal(node.right)
    val leftList = depthFirstReversal(node.left)
    return "->${node.value}".plus(rightList).plus(leftList)
}

fun createANodeTree(): Node {
  val one = Node(1)
  val three = Node(3)
  val two = Node(2)
  val five = Node(5)
    one.left = two
    one.right = three
    two.right = five

    return one
}
