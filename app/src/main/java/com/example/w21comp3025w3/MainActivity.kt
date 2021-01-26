package com.example.w21comp3025w3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.w21comp3025w3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("LifeCycle", "MainActivity.onCreate() method")

        //if the Button is pushed, change to the second activity
        binding.changeActivityButton.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
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