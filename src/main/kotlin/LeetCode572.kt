


fun subTreeOfAnother(root:Node, anotherTree:Node): Boolean {

    val otherTree = dFS(anotherTree)

    var isSubTree = true

    if(root.left  != null && root.right != null){
        val rootTree = listOf(root.value, root.left!!.value, root.right!!.value)
            for (i in rootTree.indices){
                    isSubTree = otherTree[i] == rootTree[i]
            }
        if (isSubTree)
            return isSubTree
    }

    val left = dFS(root.left)


    if(left.size == otherTree.size){
        for (i in left.indices){
            isSubTree = left[i] == otherTree[i]
        }
        if(isSubTree)
            return isSubTree
    }

    val right = dFS(root.right)
     if(right.size == otherTree.size) {
         for (i in right.indices){
             isSubTree = right[i] == otherTree[i]
         }
     }

    return isSubTree
}

fun otherTree(): Node {
    val four = Node(4)
    val one = Node(1)
    val two = Node(2)
    four.left = one
    four.right = two
    return four
}

fun rootTreeNode(): Node {
    val three = Node(3)
    val four = Node(4)
    val one = Node(1)
    val five = Node(5)
    val two = Node(2)
    val zero = Node(0)

    two.left = zero
    four.left = one
    four.right = two
    three.left = four
    three.right = five

    return three
}