package com.shanjinur.rxjava.network.model

import com.google.gson.annotations.SerializedName

class User: BaseResponse() {
    @SerializedName("api_key")
    lateinit var apiKey:String
}