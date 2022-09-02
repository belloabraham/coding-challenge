
 fun jewelsInStones(jewels:String, stones:String): Int {
     val jewelsInStones = hashMapOf<Char, Int>()

     for (jewel in stones){
         val noOfStones =   if(jewelsInStones.contains(jewel)) 1 else jewelsInStones[jewel]!!.plus(1)
         jewelsInStones[jewel] = noOfStones
     }

     var totalJewelInStones = 0

     for (jewel in jewels){
         totalJewelInStones  +=  if (jewelsInStones[jewel] == null ) 0 else jewelsInStones[jewel]!!
     }

     return totalJewelInStones
 }