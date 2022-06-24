package com.shiftkey.codingchallenge.model.data

import com.google.gson.annotations.SerializedName


data class Data (

  @SerializedName("date"   ) var date   : String?           = null,
  @SerializedName("shifts" ) var shifts : List<Shifts> = arrayListOf()

)