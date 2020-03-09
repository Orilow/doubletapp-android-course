package com.example.doubletappfirstwork

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.math.pow

class SecondActivity(): AppCompatActivity() {
    companion object {
        private const val TAG = "SecondActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundleCounter: Int = intent.getIntExtra("counter", 0)
        val textView = findViewById<TextView>(R.id.powed_counter)
        textView.text = "${bundleCounter.toDouble().pow(2.0).toInt()}"
        Log.i(TAG, "was Created")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "was Started")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "was Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "was Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "was Stopped")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "was Restarted")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "was Destroyed")
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        val intent2 = Intent()
        setResult(Activity.RESULT_OK,  intent2)
        finish()
        Log.i(TAG, "KeyDown Pressed")
        return super.onKeyDown(keyCode, event)
    }
}