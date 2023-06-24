package com.example.hiltdemo

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(var loggerService: LoggerService)  {
    fun saveUser(){
        loggerService.log("User saved in database")
    }
}