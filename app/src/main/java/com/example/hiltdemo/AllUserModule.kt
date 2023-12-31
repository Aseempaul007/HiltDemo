package com.example.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent

@InstallIn(ActivityComponent::class)
@Module
class AllUserModule {

    @Provides
    fun getAllUserRepository(): AllUserRepository{
        return AllUserSaveToLocalFirebase()
    }
}