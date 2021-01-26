package com.example.w21comp3025w3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import androidx.core.widget.addTextChangedListener
import com.example.w21comp3025w3.databinding.ActivityMainBinding
import java.nio.channels.SeekableByteChannel
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var tipPercent = 15
    private var initialMealCost = 0.0

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

        calculateTip()

        //setup a click listener for the meal total field
        binding.preTipMealTotalEditText.addTextChangedListener{
            if (!it.isNullOrBlank())
                initialMealCost = it.toString().toDouble()
            else
                initialMealCost = 0.0

            calculateTip()
        }

        //configure a listener for the seekbar
        binding.tipPercentSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tipPercent = progress

                calculateTip()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
    }

    private fun calculateTip()
    {
        //calculate the tip
        var tip = initialMealCost*tipPercent/100

        //handle the presentation logic
        val currencyFormat = NumberFormat.getCurrencyInstance()
        binding.finalTipAmountTextView.text = currencyFormat.format(tip)
        binding.totalMealCostTextView.text = currencyFormat.format(initialMealCost+tip)
        binding.tipPrecentTextView.text = "${tipPercent}%"
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