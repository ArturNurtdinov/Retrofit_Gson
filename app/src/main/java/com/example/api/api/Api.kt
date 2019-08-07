package com.example.api.api

import com.example.api.data.UsersList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("users")
    fun getUsers(@Query("q") filter: String): Call<UsersList>
}