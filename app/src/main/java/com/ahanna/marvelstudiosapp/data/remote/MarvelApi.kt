package com.ahanna.marvelstudiosapp.data.remote

import com.ahanna.marvelstudiosapp.data.remote.models.CharactersResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApi {
    @GET(CHARACTERS)
    fun getCharacters(
        @Query("apikey") apiKey: String,
        @Query("hash") hashKey: String,
        @Query("ts") timeStamp: Long,
        @Query("limit") limit: Int,
        @Query("offset") offset: Long,
        @Query("nameStartsWith") name: String
    ): Call<CharactersResponse>
}