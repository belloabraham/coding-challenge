import java.util.*

class TreeNode(val value:Int, var left:TreeNode? = null, var right:TreeNode? = null)


fun lCA(root:TreeNode, leftTarget:Int, rightTarget: Int): Int {
    val queue:Queue<TreeNode> = LinkedList()
    queue.add(root)
   return bFS(queue, leftTarget , rightTarget)
}

fun bFS(queue:Queue<TreeNode>, leftTarget:Int, rightTarget:Int): Int {
    if(queue.isEmpty())
        return 0

    val next = queue.remove()

    if(leftTarget == next.left?.value && rightTarget == next.right?.value)
        return next.value

    if(leftTarget == next.value && rightTarget == next.right?.value)
        return next.value

    if(leftTarget == next.left?.value && rightTarget == next.value)
        return next.value

    if(next.left != null)
        queue.add(next.left)
    if(next.right != null)
        queue.add(next.right)

    return 0 + bFS(queue, leftTarget, rightTarget)
}



fun createTreeNode(): TreeNode {
    val six = TreeNode(6)
    val two = TreeNode(2)
    val eight = TreeNode(8)
    val zero = TreeNode(0)
    val four = TreeNode(4)
    val five = TreeNode(5)
    val seven = TreeNode(7)
    val three = TreeNode(3)
    val nine = TreeNode(9)
    six.left = two
    six.right = eight
    two.left = zero
    two.right = four
    eight.left = seven
    eight.right = nine
    four.left = three
    four.right = five

    return six
}