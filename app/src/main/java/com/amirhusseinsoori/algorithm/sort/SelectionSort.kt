package com.amirhusseinsoori.algorithm.sort

import android.util.Log

class SelectionSort : Sorting {
    override fun sort(array: Array<Int>): Array<Int> {
        var selsection: Int
        for (i in 0..array.size - 1) {
            var index = i
            for (j in array.size - 1 downTo i) {
                if (array[j] < array[index]) {
                    index = j
                }
            }
            if (i != index) {
                selsection = array[i]
                array[i] = array[index]
                array[index] = selsection
            }
        }
        return array
    }
}