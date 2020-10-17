package kz.damirtokmashov.sampleretrofit.api

import kz.damirtokmashov.sampleretrofit.util.Constants.Companion.URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api:SampleApi by lazy{
        retrofit.create(SampleApi::class.java)
    }

}