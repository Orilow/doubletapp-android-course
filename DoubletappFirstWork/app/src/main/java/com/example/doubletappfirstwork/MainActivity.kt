package com.example.doubletappfirstwork

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    private var counter: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterView.text = counter.toString()
        buttonOne.setOnClickListener {
            Log.i(Companion.TAG, "Button was clicked");
            startActivityForResult(
                SecondActivity.createSecondActivityIntent(this, counter),
                1
            )
        }
        Log.i(Companion.TAG, "Was created");
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

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        counterView.text = (++counter).toString()
        Log.i(Companion.TAG, "configuration was changed.");
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.i(Companion.TAG, "Returned from second Activity");
    }
}
