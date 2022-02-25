package com.amirhusseinsoori.algorithm.sort

class CountingSort : SortAlgorithm{
    override fun sort(array: Array<Int>): Array<Int> {
        var max = array[0]

        for (i in array) {
            if (i > max) {

                max = i
            }
        }

        val count = Array<Int>(max + 1) { 0 }

        for (item in array) {
            count[item] = count[item] + 1
        }

        val sort = Array<Int>(array.size) { 0 }

        var indexOfSort = 0
        for (i in count.indices) {
            for (j in 0 until count[i]) {
                sort[indexOfSort] = i
                indexOfSort++
            }
        }
        return sort
    }

}