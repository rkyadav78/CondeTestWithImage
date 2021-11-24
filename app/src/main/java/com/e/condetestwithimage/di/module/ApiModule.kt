package com.e.condetestwithimage.di.module

import com.e.condetestwithimage.network.Api
import com.e.condetestwithimage.network.RetrofitService
import com.e.condetestwithimage.network.UserService
import dagger.Module
import dagger.Provides

@Module
class ApiModule {

    @Provides
    fun provideUserApi(): Api {
        return RetrofitService.create()!!
    }

    @Provides
    fun provideUserService() : UserService {
        return UserService()
    }
}