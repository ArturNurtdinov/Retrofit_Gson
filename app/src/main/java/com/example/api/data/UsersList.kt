package com.example.api.data

import com.google.gson.annotations.SerializedName

//top level
class UsersList {
    @SerializedName("items")
    var users: List<Users>? = null
    @SerializedName("total_count")
    var total_count: Int = 0
    @SerializedName("incomplete_results")
    var incomplete_results: Boolean? = null
}