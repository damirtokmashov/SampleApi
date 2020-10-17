package kz.damirtokmashov.sampleretrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kz.damirtokmashov.sampleretrofit.model.Post
import kz.damirtokmashov.sampleretrofit.repository.Repository

class MainViewModel(private val repository: Repository) :ViewModel(){

    val myResponse: MutableLiveData<Post>  = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response:Post = repository.getPost()
            myResponse.value = response
        }
    }

}