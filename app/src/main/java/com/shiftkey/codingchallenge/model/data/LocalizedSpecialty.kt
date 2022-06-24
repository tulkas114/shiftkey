package com.shiftkey.codingchallenge.model.data

import com.google.gson.annotations.SerializedName


data class LocalizedSpecialty (

  @SerializedName("id"           ) var id           : Int?       = null,
  @SerializedName("specialty_id" ) var specialtyId  : Int?       = null,
  @SerializedName("state_id"     ) var stateId      : Int?       = null,
  @SerializedName("name"         ) var name         : String?    = null,
  @SerializedName("abbreviation" ) var abbreviation : String?    = null,
  @SerializedName("specialty"    ) var specialty    : Specialty? = Specialty()

)