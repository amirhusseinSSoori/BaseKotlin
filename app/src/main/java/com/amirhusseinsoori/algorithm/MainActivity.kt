package com.amirhusseinsoori.algorithm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.amirhusseinsoori.algorithm.sort.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array = arrayOf(4, 5, 3, 2, 1, 2, 3)

        for (i in sort(SortAlgorithm.SELECTION).sort(array)) {
            Log.e("TAG", "onCreate: ${i}")
        }


    }


    private fun sort(sort: SortAlgorithm): Sorting {
        return when (sort) {
            SortAlgorithm.BUBBLE -> BubbleSort()
            SortAlgorithm.INSERTION -> InsertionSort()
            SortAlgorithm.COUNTING -> CountingSort()
            SortAlgorithm.SELECTION -> SelectionSort()
        }

    }

}


