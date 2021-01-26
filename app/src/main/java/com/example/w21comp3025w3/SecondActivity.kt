package com.example.w21comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("LifeCycle", "SecondActivity.onCreate() method")
    }

    override fun onStart(){
        Log.i("LifeCycle", "SecondActivity.onStart() method")
        super.onStart()
    }

    override fun onResume(){
        Log.i("LifeCycle", "SecondActivity.onResume() method")
        super.onResume()

    }override fun onPause(){
        Log.i("LifeCycle", "SecondActivity.onPause() method")
        super.onPause()

    }override fun onStop(){
        Log.i("LifeCycle", "SecondActivity.onStop() method")
        super.onStop()

    }override fun onDestroy(){
        Log.i("LifeCycle", "SecondActivity.onDestroy() method")
        super.onDestroy()
    }
}