package com.example.w21comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LifeCycle", "MainActivity.onCreate() method")
    }

    override fun onStart(){
        Log.i("LifeCycle", "MainActivity.onStart() method")
        super.onStart()
    }

    override fun onResume(){
        Log.i("LifeCycle", "MainActivity.onResume() method")
        super.onResume()

    }override fun onPause(){
        Log.i("LifeCycle", "MainActivity.onPause() method")
        super.onPause()

    }override fun onStop(){
        Log.i("LifeCycle", "MainActivity.onStop() method")
        super.onStop()

    }override fun onDestroy(){
        Log.i("LifeCycle", "MainActivity.onDestroy() method")
        super.onDestroy()
    }
}