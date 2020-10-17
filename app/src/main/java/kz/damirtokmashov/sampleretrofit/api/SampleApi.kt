package kz.damirtokmashov.sampleretrofit.api

import kz.damirtokmashov.sampleretrofit.model.Post
import retrofit2.http.GET

interface SampleApi {

    @GET("typicode/demo/profile")
    suspend fun getPost():Post

}