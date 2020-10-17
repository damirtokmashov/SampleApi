package kz.damirtokmashov.sampleretrofit.repository

import kz.damirtokmashov.sampleretrofit.api.RetrofitInstance
import kz.damirtokmashov.sampleretrofit.model.Post
import retrofit2.Retrofit

class Repository {

    suspend fun getPost(): Post{
        return RetrofitInstance.api.getPost()
    }

}