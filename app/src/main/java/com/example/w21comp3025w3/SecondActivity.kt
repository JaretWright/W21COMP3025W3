package com.example.w21comp3025w3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.w21comp3025w3.databinding.ActivityMainBinding
import com.example.w21comp3025w3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("LifeCycle", "SecondActivity.onCreate() method")

        //if the Button is pushed, change to the second activity
        binding.changeActivityButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
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