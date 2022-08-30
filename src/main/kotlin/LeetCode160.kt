import kotlin.reflect.typeOf

data class ListNode(val value:Int, var next:ListNode?=null)



fun pointOfIntersection(first:ListNode, second:ListNode): ListNode? {

    val firstResult = dFS(first)
    val secondResult= dFS(second)

    val minListSize = Math.min(firstResult.size, secondResult.size)

    for (i in 0 until minListSize){
        if(firstResult[i]?.equals(secondResult[i]) == true)
            return firstResult[i]
    }

   return null
}


fun dFS(root:ListNode?): List<ListNode?> {
    if(root == null)
        return emptyList()
    val result =  dFS(root.next)
    return listOf(root.next).plus(result)
}

fun createListNode(length:Int){
    val cNode = ListNode(1)
    for (i in 2..3){
        cNode.next = ListNode(i)
    }

    val result = ListNode(1)
    for (i in 2..length){
        result.next = ListNode(i)
    }
    addCNode(result, cNode.next)
}

fun addCNode(node:ListNode, cNode:ListNode?){
    if(cNode == null)
        return
    node.next = cNode
    addCNode(node, cNode.next)
}