package com.amirhusseinsoori.kotlin_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.amirhusseinsoori.kotlin_sample.sort.CountingSort
import java.util.concurrent.Flow
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.pow
import kotlin.math.sign

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        for (item in CountingSort().sort(arrayOf(4,5,6,2,1,1,3,4,5,6,7,8,0))){
            Log.e("CountingSort", "onCreate:${item} ", )
        }


    }








}


