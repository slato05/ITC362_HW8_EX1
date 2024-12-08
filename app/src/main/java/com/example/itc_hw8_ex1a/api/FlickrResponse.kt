package com.example.itc_hw8_ex1a.api

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class FlickrResponse(
    val photos: PhotoResponse
)