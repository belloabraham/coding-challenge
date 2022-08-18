

//Binary Tree Node
class BinaryNode(val value:String, var leftRef:BinaryNode?=null, var rightRef:BinaryNode?=null)

fun createBinaryTree(){
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
}