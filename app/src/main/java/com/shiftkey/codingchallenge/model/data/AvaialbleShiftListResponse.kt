package com.shiftkey.codingchallenge.model.data

import com.google.gson.annotations.SerializedName


data class AvaialbleShiftListResponse (

  @SerializedName("data"  ) var data  : ArrayList<Data>   = arrayListOf(),
  @SerializedName("links" ) var links : ArrayList<String> = arrayListOf(),
  @SerializedName("meta"  ) var meta  : Meta?             = Meta()

)