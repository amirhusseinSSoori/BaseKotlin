package com.amirhusseinsoori.algorithm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.amirhusseinsoori.algorithm.sort.CountingSort
import com.amirhusseinsoori.algorithm.sort.InsertionSort
import com.amirhusseinsoori.kotlin_sample.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        for (item in CountingSort().sort(arrayOf(4, 5, 6, 2, 1, 1, 0, 3, 4, 5, 6, 7, 8))) {
            Log.e("CountingSort", "sort : $item ")
        }


        for (item in InsertionSort().sort(arrayOf(4, 5, -4, 6, 2, -1, 1, 3, 0, 4, 5, 6, 7, 8, 0))) {
            Log.e("InsertionSort", "sort : $item ")
        }





    }





}


