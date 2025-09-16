package com.example.flixster

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("title")
    val title: String,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("poster_path")
    val posterPath: String?
) {
    fun getPosterUrl(): String {
        return "https://image.tmdb.org/t/p/w342$posterPath"
    }
}