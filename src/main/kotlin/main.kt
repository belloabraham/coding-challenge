import java.util.*

fun main(args: Array<String>) {
   val nodeTree = createANodeTree2()

    val result =  pathSum(nodeTree, 22)

   result.forEach {

      it.forEach {
      //    println(it)
      }
       println()
   }

 //   println(result.sum())

}
