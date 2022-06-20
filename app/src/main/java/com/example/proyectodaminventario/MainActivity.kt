package com.example.proyectodaminventario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }


    fun initUI(){
        btnContinue.setOnClickListener { accessToDetail() }
    }

   fun accessToDetail(){
       if (etName.text.toString().isnotEmpty())}
            Prefs.saveName(etName.text.toString())
            Prefs.saveVIP(cbVip.isChecked)
           goToDetail()
       }else{
           //Hacer otra cosa
       }
   }


    fun goToDetail(){
        startActivity(Intent(packageContext: this, ResultActivity: class.java))
    }