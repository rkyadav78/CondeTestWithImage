package com.rajesh.mvvmunittestingassignment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.e.condetestwithimage.model.ModelResponse
import com.e.condetestwithimage.repository.MainRepository

/*
*Created by rajeshkumar07 on 01-08-2020
*/
class MainViewModel :  ViewModel(){

    private val mainRepository = MainRepository()
    var users = MutableLiveData<ModelResponse>()
    var userLoadError = MutableLiveData<Boolean>()
    var loading = MutableLiveData<Boolean>()

    //public refresh function it calls the fetchCountries method to perform the task
    fun refresh(){
        mainRepository.fetchUserList()
        users = mainRepository.users
        userLoadError = mainRepository.userLoadError
        loading = mainRepository.loading
    }

    /**
     *build-in method of ViewModel class which is provided by Google and it clears disposable a of the cache of the device
     * prevent the memory leaks and app crashes
     */
    override fun onCleared() {
        super.onCleared()
        mainRepository.disposable.clear()
    }
}