

fun pathSum(root:Node?, target:Int): ArrayList<MutableList<Int>> {
    val paths = arrayListOf<MutableList<Int>>()
    pathToLeafSum(root, target, arrayListOf(), paths)
    return  paths
}

fun pathToLeafSum(node:Node?, target:Int, current:MutableList<Int>, paths:ArrayList<MutableList<Int>>){

    if(node == null)
        return

    current.add(node.value)

    if(node.value == target && node.left == null && node.right == null) {
        paths.add(current)
        return
    }

    val newList = mutableListOf<Int>()
    newList.addAll(current)

    pathToLeafSum(node.left, target - node.value, newList, paths)
    pathToLeafSum(node.right, target - node.value, newList, paths)
}
