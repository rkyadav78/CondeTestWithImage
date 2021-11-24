package com.e.condetestwithimage.repository

import androidx.lifecycle.MutableLiveData
import com.e.condetestwithimage.di.component.DaggerApiComponent
import com.e.condetestwithimage.model.ModelResponse
import com.e.condetestwithimage.network.UserService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainRepository {

    @Inject
    lateinit var userService: UserService
    val disposable = CompositeDisposable()

    val users = MutableLiveData<ModelResponse>()
    val userLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()
    init {
        DaggerApiComponent.create().inject(this)
    }
    /**
     *fetch data from api
     */
    fun fetchUserList() {
        loading.value = true
        disposable.add(
            userService.getUser().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<ModelResponse>() {
                    override fun onSuccess(t: ModelResponse) {
                        users.value = t
                        userLoadError.value = false
                        loading.value = false
                    }

                    override fun onError(e: Throwable) {
                        userLoadError.value = true
                        loading.value = false
                    }

                })
        )
    }
}