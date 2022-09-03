package sorting

//T = O(n log n) S = O(n) Stable
fun mergeSort(array: IntArray){
    val arraySize= array.size

    if(arraySize < 2)
        return

    val firstLen = arraySize/2
    val secondLen = arraySize - firstLen

    val leftHalf = IntArray(firstLen)
    val rightHalf = IntArray(secondLen)

    for (i in 0 until firstLen)
        leftHalf[i] = array[i]

    for (i in firstLen until  arraySize)
        rightHalf[i - firstLen] = array[i]

    mergeSort(leftHalf)
    mergeSort(rightHalf)

    merge(array, leftHalf, rightHalf)

}

fun merge(outputArray: IntArray, leftHalf:IntArray, rightHalf:IntArray){
    val leftHalfSize = leftHalf.size
    val rightHalfSize = rightHalf.size
    var leftHalfIndex = 0
    var rightHalfIndex = 0
    var outputArrayIndex = 0
     while (leftHalfIndex < leftHalfSize && rightHalfIndex < rightHalfSize ){
         if(leftHalf[leftHalfIndex] <= rightHalf[rightHalfIndex]){
              outputArray[outputArrayIndex]  =  leftHalf[leftHalfIndex]
             leftHalfIndex++
         }else{
             outputArray[outputArrayIndex]  =  rightHalf[rightHalfIndex]
             rightHalfIndex++
         }
         outputArrayIndex++
     }

    while (leftHalfIndex < leftHalfSize){
        outputArray[outputArrayIndex] = leftHalf[leftHalfIndex]
        leftHalfIndex++
        outputArrayIndex++
    }

    while (rightHalfIndex < rightHalfSize){
        outputArray[outputArrayIndex] = rightHalf[rightHalfIndex]
        rightHalfIndex++
        outputArrayIndex++
    }

}


