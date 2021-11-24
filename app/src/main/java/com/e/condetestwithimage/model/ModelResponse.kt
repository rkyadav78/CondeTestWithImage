package com.e.condetestwithimage.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ModelResponse(
    @SerializedName("articles")
    var articles: List<Article>? = listOf(),
    @SerializedName("status")
    var status: String? = "",
    @SerializedName("totalResults")
    var totalResults: Int? = 0
):Serializable{
    data class Article(
        @SerializedName("author")
        var author: String? = "",
        @SerializedName("content")
        var content: String? = "",
        @SerializedName("description")
        var description: String? = "",
        @SerializedName("publishedAt")
        var publishedAt: String? = "",
        @SerializedName("source")
        var source: Source? = Source(),
        @SerializedName("title")
        var title: String? = "",
        @SerializedName("url")
        var url: String? = "",
        @SerializedName("urlToImage")
        var urlToImage: String? = ""
    ): Serializable

    data class Source(
        @SerializedName("id")
        var id: String? = "",
        @SerializedName("name")
        var name: String? = ""
    ): Serializable
}

/*
data class ModelResponse(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: ArrayList<Result>
):Serializable {
    data class Info(
        @SerializedName("page")
        val page: Int,
        @SerializedName("results")
        val results: Int,
        @SerializedName("seed")
        val seed: String,
        @SerializedName("version")
        val version: String
    ): Serializable


    data class Result(
        @SerializedName("cell")
        val cell: String,
        @SerializedName("dob")
        val dob: Dob,
        @SerializedName("email")
        val email: String,
        @SerializedName("gender")
        val gender: String,
        @SerializedName("id")
        val id: Id,
        @SerializedName("location")
        val location: Location,
        @SerializedName("login")
        val login: Login,
        @SerializedName("name")
        val name: Name,
        @SerializedName("nat")
        val nat: String,
        @SerializedName("phone")
        val phone: String,
        @SerializedName("picture")
        val picture: Picture,
        @SerializedName("registered")
        val registered: Registered
    ): Serializable{
        data class Dob(
            @SerializedName("age")
            val age: Int,
            @SerializedName("date")
            val date: String
        ):Serializable

        data class Id(
            @SerializedName("name")
            val name: String,
            @SerializedName("value")
            val value: String
        ):Serializable

        data class Location(
            @SerializedName("city")
            val city: String,
            @SerializedName("coordinates")
            val coordinates: Coordinates,
            @SerializedName("country")
            val country: String,
            @SerializedName("postcode")
            val postcode: String,
            @SerializedName("state")
            val state: String,
            @SerializedName("street")
            val street: Street,
            @SerializedName("timezone")
            val timezone: Timezone
        ):Serializable {
            data class Coordinates(
                @SerializedName("latitude")
                val latitude: String,
                @SerializedName("longitude")
                val longitude: String
            ):Serializable

            data class Street(
                @SerializedName("name")
                val name: String,
                @SerializedName("number")
                val number: Int
            ):Serializable

            data class Timezone(
                @SerializedName("description")
                val description: String,
                @SerializedName("offset")
                val offset: String
            ):Serializable
        }

        data class Login(
            @SerializedName("md5")
            val md5: String,
            @SerializedName("password")
            val password: String,
            @SerializedName("salt")
            val salt: String,
            @SerializedName("sha1")
            val sha1: String,
            @SerializedName("sha256")
            val sha256: String,
            @SerializedName("username")
            val username: String,
            @SerializedName("uuid")
            val uuid: String
        ):Serializable

        data class Name(
            @SerializedName("first")
            val first: String,
            @SerializedName("last")
            val last: String,
            @SerializedName("title")
            val title: String
        ):Serializable

        data class Picture(
            @SerializedName("large")
            val large: String,
            @SerializedName("medium")
            val medium: String,
            @SerializedName("thumbnail")
            val thumbnail: String
        ):Serializable

        data class Registered(
            @SerializedName("age")
            val age: Int,
            @SerializedName("date")
            val date: String
        ):Serializable
    }
}*/
