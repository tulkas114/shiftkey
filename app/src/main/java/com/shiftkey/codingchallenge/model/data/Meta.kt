package com.shiftkey.codingchallenge.model.data

import com.google.gson.annotations.SerializedName


data class Meta (

  @SerializedName("lat" ) var lat : Double? = null,
  @SerializedName("lng" ) var lng : Double? = null

)