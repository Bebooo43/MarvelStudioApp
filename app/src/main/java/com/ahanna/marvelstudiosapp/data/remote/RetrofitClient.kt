package com.ahanna.marvelstudiosapp.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
        private var api: MarvelApi? = null

        fun getInstance(): MarvelApi {
            if (api == null) {
                api = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(MarvelApi::class.java)
            }
            return api!!
        }
    }
}