package com.hi.dhl.splashscreen.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hi.dhl.binding.viewbind
import com.hi.dhl.splashscreen.databinding.ActivitySecordBinding

class SecondActivity : AppCompatActivity() {
    private val binding: ActivitySecordBinding by viewbind()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(binding){
            Toast.makeText(this@SecondActivity, "初始化SecordActivity", Toast.LENGTH_SHORT).show()
        }
    }
}