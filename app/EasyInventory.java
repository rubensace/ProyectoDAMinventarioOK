package com.example.proyectodaminventario

import android.app.Application

class EasyInventory : Application() {
    
    companion objetc{
        lateint var prefs: Prefs
    }
        
    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}