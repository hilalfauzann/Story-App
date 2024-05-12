package com.elapp.storyapp.data.remote.auth

import com.elapp.storyapp.data.model.User
import com.google.gson.annotations.SerializedName

data class AuthResponse(
    @SerializedName("loginResult")
    val loginResult: User,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val message: String

)