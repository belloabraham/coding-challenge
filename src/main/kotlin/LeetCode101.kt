


fun isSymmetricNodes(root:Node): Boolean {
   return compareNodes(root.left, root.right)
}

fun compareNodes(left:Node?, right:Node?):Boolean {

     if(left == null || right == null)
         return left == right

    val leftVal = compareNodes(left.left, right.right)
    val rightVal = compareNodes(left.right, right.left)

     return (left.value == right.value) && leftVal && rightVal
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