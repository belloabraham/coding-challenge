import java.util.*

//Binary Tree Node
class BinaryNode(val value:String, var leftRef:BinaryNode?=null, var rightRef:BinaryNode?=null)
class BinaryNodeNumber(val value:Int, var leftRef:BinaryNodeNumber?=null, var rightRef:BinaryNodeNumber?=null)


//Max path sum
//min path sum
//Max value

fun createNumbTree(): BinaryNodeNumber {
    val one = BinaryNodeNumber(1)
    val two = BinaryNodeNumber(2)
    val three = BinaryNodeNumber(3)
    val four = BinaryNodeNumber(4)
    val five = BinaryNodeNumber(5)
    val six = BinaryNodeNumber(6)

    one.leftRef = two
    one.rightRef = three
    two.leftRef = five
    two.rightRef = four
    three.rightRef = six

    return one

}

fun createStringTree(): BinaryNode {
    val a = BinaryNode("A") //root node
    val b = BinaryNode("B")
    val c = BinaryNode("C")
    val d = BinaryNode("D")
    val e = BinaryNode("E")
    val f = BinaryNode("F")

    a.leftRef = b
    a.rightRef = c
    b.leftRef = d
    b.rightRef = e
    c.rightRef = f

    //a is the root
    return a

    /*
    *         a
    *       /  \
    *     b      c
    *   /   \      \
    *  d     e      f
    * */
}

//T= O(n) S= O(n)
fun depthFirstReversal(rootLeftOrRightRefNode:BinaryNode?): List<String> {
    //Break condition
    if(rootLeftOrRightRefNode==null)
        return emptyList()

    //Recursion with Next value
    val rightList  = depthFirstReversal(rootLeftOrRightRefNode.rightRef)
    val leftList = depthFirstReversal(rootLeftOrRightRefNode.leftRef)
    return listOf(rootLeftOrRightRefNode.value).plus(leftList).plus(rightList)
}

//T= O(n)
fun breathFirstReversal(rootNode: BinaryNode){
    val queue:Queue<BinaryNode> = LinkedList()
    queue.add(rootNode)
    bfRecursion(queue)
}
fun bfRecursion(queue:Queue<BinaryNode>){
    if(queue.isEmpty())
        return

    val firstItem = queue.remove()
    println(firstItem.value)

    if(firstItem.leftRef !=null)
        queue.add(firstItem.leftRef)
    if(firstItem.rightRef !=null)
        queue.add(firstItem.rightRef)

    bfRecursion(queue)
}

//T= O(n)
fun treeIncludes(node:BinaryNode?, target:String): Boolean {
    if(node == null)
        return false

    val leftResult = treeIncludes(node.leftRef, target)
    val rightResult = treeIncludes(node.rightRef, target)

    return  node.value == target || leftResult || rightResult
}

//T = O(n)
fun treeSum(binaryNodeNumber: BinaryNodeNumber?): Int {
    if(binaryNodeNumber==null)
        return 0

    val leftValue = treeSum(binaryNodeNumber.leftRef)
    val rightValue = treeSum(binaryNodeNumber.rightRef)

    return  binaryNodeNumber.value.plus(leftValue).plus(rightValue)
}

//T= O(n)
fun treeMinValue(binaryNodeNumber: BinaryNodeNumber?): Int? {
    if(binaryNodeNumber==null)
        return null

    val leftValue = if (treeMinValue(binaryNodeNumber.leftRef) == null) binaryNodeNumber.value else treeMinValue(binaryNodeNumber.leftRef)
    val rightValue = if(treeMinValue(binaryNodeNumber.rightRef) == null) binaryNodeNumber.value else treeMinValue(binaryNodeNumber.rightRef)

    return  Math.min(binaryNodeNumber.value, Math.min(leftValue!!, rightValue!!))
}

//T = O(n)
fun maxPath(node: BinaryNodeNumber?, max:Int): Boolean {

    if(node == null){
        return false
    }else if(node.leftRef == null && node.rightRef == null && (max - node.value) == 0){
        //Checking if I got the answer at the leaf
        return true
    }else{
        val leftRef = maxPath(node.leftRef, max - node.value)
        val rightRef = maxPath(node.rightRef, max - node.value)

       return  leftRef || rightRef
    }

}




/*fun treeSum2(binaryNodeNumber: BinaryNodeNumber): Int {
    val queue:Queue<BinaryNodeNumber> = LinkedList()
    queue.add(binaryNodeNumber)


    var count = 0

    while (queue.isNotEmpty()){

        val nextNode = queue.remove()
        count += nextNode.value

        if(nextNode.leftRef != null)
            queue.add(nextNode.leftRef)
        if(nextNode.rightRef != null)
            queue.add(nextNode.rightRef)
    }

    return count
}

fun depthFirstReversal(rootNode:BinaryNode): Array<String> {
  //  val stack = Stack<BinaryNode>()
  //  stack.push(rootNode)

    //Stack complexity is O(n) as we visited each item once in a loop cycle
    //Space complexity is O(n) as we saved each item once in a data structure
    /*while (!stack.empty()){
        val topRef = stack.pop()
        println(topRef.value)
        val leftRef = topRef.leftRef
        val rightRef =topRef.rightRef
        if (rightRef!=null)
            stack.push(rightRef)
        if(leftRef !=null)
            stack.push(leftRef)
    }*/

     return dfRecursion(rootNode).toTypedArray()
}*/


