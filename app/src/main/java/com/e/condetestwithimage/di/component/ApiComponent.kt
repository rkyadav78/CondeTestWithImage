package com.e.condetestwithimage.di.component

import com.e.condetestwithimage.di.module.ApiModule
import com.e.condetestwithimage.network.UserService
import com.e.condetestwithimage.repository.MainRepository
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service : UserService)

    fun inject(mainRepository : MainRepository)

}