package com.example.hiltdemo

import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class LoggerService @Inject constructor(){

    fun log(msg: String){
        Log.d("Hilt_TAG",msg)
    }
}