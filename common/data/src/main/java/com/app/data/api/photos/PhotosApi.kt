package com.app.data.api.photos

import com.app.core.photos.model.Photo
import retrofit2.Response
import retrofit2.http.GET

interface PhotosApi {

    @GET("photos")
    fun getPhotos(): Response<List<Photo>>
}