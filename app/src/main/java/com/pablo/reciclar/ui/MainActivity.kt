package com.pablo.reciclar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pablo.reciclar.databinding.ActivityMainBinding
import com.pablo.reciclar.model.Lugar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recycle.adapter = LugarAdapter(lugares)

        }
    }

    private val lugares = (1..100).map {
        Lugar("Lugar $it", "https://loremflickr.com/240/320/paris?lock=$it")
    }
}

