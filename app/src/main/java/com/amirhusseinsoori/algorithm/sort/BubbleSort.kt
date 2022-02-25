package com.amirhusseinsoori.algorithm.sort

class BubbleSort : SortAlgorithm {
    override fun sort(array: Array<Int>): Array<Int> {
        var swap = true
        while(swap){
            swap = false
            for(i in 0 until array.size-1){
                if(array[i] > array[i+1]){
                    val temp = array[i]
                    array[i] = array[i+1]
                    array[i + 1] = temp

                    swap = true
                }
            }
        }
        return array
    }
}