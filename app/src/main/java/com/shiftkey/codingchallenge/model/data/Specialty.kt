package com.shiftkey.codingchallenge.model.data

import com.google.gson.annotations.SerializedName


data class Specialty (

  @SerializedName("id"           ) var id           : Int?    = null,
  @SerializedName("name"         ) var name         : String? = null,
  @SerializedName("color"        ) var color        : String? = null,
  @SerializedName("abbreviation" ) var abbreviation : String? = null

)