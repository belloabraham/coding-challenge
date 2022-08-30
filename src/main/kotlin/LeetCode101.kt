
fun isSymmetric(root:Node): Boolean {

    val leftTree = bFS(root.left).sorted()
    val rightTree = bFS(root.right).sorted()

      if(leftTree.size != 3 || rightTree.size != 3)
          return false


    for(i in leftTree.indices){
        if(leftTree[i] != rightTree[i])
            return false
    }

    return true
}


fun bFS(node:Node?): List<Int> {
    if(node == null)
        return emptyList<Int>()
    val left = bFS(node.left)
    val right = bFS(node.right)
    return listOf(node.value).plus(left).plus(right)
}

fun createSymmetricNode(): Node {
  val one = Node(1)
    val two = Node(2)
    val secondTwo = Node(2)
    val three = Node(3)
    val secondThree = Node(3)
    val four = Node(4)
    val secondFour = Node(4)

    one.left = two
    one.right = secondTwo
    two.left = three
    two.right = four
    secondTwo.left = secondFour
    secondTwo.right = secondThree

    return one

}