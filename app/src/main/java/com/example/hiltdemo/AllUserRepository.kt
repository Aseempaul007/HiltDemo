package com.example.hiltdemo

import android.util.Log


const val TAG = "MyTAG"

interface AllUserRepository{
    fun saveToDb()
}

class AllUserSaveToLocalDb: AllUserRepository{
    override fun saveToDb() {
        Log.d(TAG,"User save in local database")
    }
}

class AllUserSaveToLocalFirebase: AllUserRepository{
    override fun saveToDb() {
        Log.d(TAG,"User save in Firebase database")
    }
}
