import java.util.*


fun stringContainsBinaryCode(codes:String, len:Int): Boolean {

    if(len == 2){
        val stack = Stack<String>()
        stack.add("00")
        stack.add("10")
        stack.add("11")
        stack.add("01")

        for (i in stack.indices){
           if(codes.contains(stack.peek())){
               stack.pop()
            }
        }

        return  stack.isEmpty()

    }else if(len == 1){
        val stack = Stack<String>()
        stack.add("1")
        stack.add("0")
        for (item in stack.indices){
             if(codes.contains(stack.peek())){
                 stack.pop()
             }
        }

        return  stack.isEmpty()
    }

   return false
}