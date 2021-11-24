package com.e.condetestwithimage.network

import com.e.condetestwithimage.di.component.DaggerApiComponent
import com.e.condetestwithimage.model.ModelResponse
import com.e.condetestwithimage.network.Api
import io.reactivex.Single
import javax.inject.Inject

class UserService {

    @Inject
    lateinit var api: Api

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getUser(): Single<ModelResponse> {
        return api.getRandomUserList()
    }
}