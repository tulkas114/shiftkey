package com.shiftkey.codingchallenge.model

import com.shiftkey.codingchallenge.model.data.AvaialbleShiftListResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap


interface ShiftKeyApi {
    @GET("available_shifts")
    suspend fun getAvailableShiftsList(@QueryMap options: Map<String, String>): AvaialbleShiftListResponse
}