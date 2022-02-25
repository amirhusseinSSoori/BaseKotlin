package com.amirhusseinsoori.algorithm.sort

class InsertionSort : Sorting {
    override fun sort(array: Array<Int>): Array<Int> {
        var item: Int
        var i: Int
        for (k in 1 until array.size) {
            item = array[k]
            i = k
            while (i > 0 && array[i - 1] > item) {
                array[i] = array[i - 1]
                i -= 1
            }
            array[i] = item
        }


        return array
    }
}