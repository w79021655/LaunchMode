package com.sample.launchmode

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sample.launchmode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    object KEY {
        var TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e(KEY.TAG, "onCreate")

        binding.button.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.buttonB.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, MainActivity2::class.java)
            startActivity(intent)
        }

        binding.buttonC.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, MainActivity3::class.java)
            startActivity(intent)
        }

        binding.buttonD.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e(KEY.TAG, "onNewIntent")
    }

    override fun onStart() {
        super.onStart()
        Log.e(KEY.TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(KEY.TAG, "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(KEY.TAG, "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e(KEY.TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(KEY.TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(KEY.TAG, "onDestroy")
    }
}