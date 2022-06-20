package com.example.proyectodaminventario

import android.content.Context

class Prefs(val context: Context) {

    val SHARED_NAME = "Mydtb"
    val SHARED_USER_NAME = "username"
    val SHARED_VIP = "Usuario"

    val storage = context.getSharedPreferences(SHARED_NAME, mode: 0)

    fun saveName(name:String){
        storage.edit().putString(SHARED_USER_NAME, name).apply()
    }

    fun saveVIP(vip:Boolean) {
        storage.edit().putBoolean(SHARED_VIP, vip).apply()
    }

    fun getName(): String{
        return storage.getString(SHARED_USER_NAME, defValue: "") !!
    }

    fun getVip(): Boolean{
        val defValue = false
        return storage.getBoolean(SHARED_VIP, defValue: false)
    }
    fun wipe(){
        storage.edit().clear().apply()
    }
}