package com.example.itc_hw8_ex1a.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GalleryItem(
    val title: String,
    val id: String,
    @Json(name = "url_s") val url: String,
)


/*
data class GalleryItem(
    val title: String,
    val id: String,
     val url: String,
)
*/
