package com.example.proyectodaminventario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initUi()
    }

    fun initUi() {
        btnBack.setOnClickListener {it:View!
            prefs.wipe()
            onBackPressed()
        }
        val userName = prefs.getName ()
        tvName.text = "Bienvenido $userName"
        if (pref.getVIP()){
            setVipColorBackground()

            }
        }
        fun setVIPColorBackground(){
            container.setBackgroundColor(ContextCompat.getColor(context:this,R.color.vip_yellow))

        }
    }
}