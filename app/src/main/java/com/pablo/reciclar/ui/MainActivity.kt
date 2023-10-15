package com.pablo.reciclar.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pablo.reciclar.databinding.ActivityMainBinding
import com.pablo.reciclar.model.Lugar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recycle.adapter = LugarAdapter(lugares) { lugar ->

                val latLng = "${lugar.latitud},${lugar.longitud}"
                val uri = "geo:$latLng?q=${Uri.encode(lugar.nombre)}"
                val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                startActivity(mapIntent)
            }
            }

        }
    }

    private val lugares = (1..100).map {
        Lugar("Lugar $it", "https://loremflickr.com/240/320/paris?lock=$it", "40.4165000", "-3.7025600")
    }