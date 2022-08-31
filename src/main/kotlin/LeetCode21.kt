

fun mergeTwoList(first:List<Int>, second:List<Int>): List<Int> {
    
        if(first.isEmpty())
            return second
    
        if (second.isEmpty())
             return  first
    
       val loopSize  = if(first.size > second.size) first.size else second.size
    
    
       val newLIst = mutableListOf<Int>()
    
      for(i in 0 until loopSize){
          
          if(i>=second.size){
              newLIst.add(first[i])
          }else if(i>= first.size){
              newLIst.add(second[i])
          }else if(first[i] < second[i]){
              newLIst.add(first[i])
              newLIst.add(second[i])
          }else{
              newLIst.add(second[i])
              newLIst.add(first[i])
          }
      }

    return  newLIst
}