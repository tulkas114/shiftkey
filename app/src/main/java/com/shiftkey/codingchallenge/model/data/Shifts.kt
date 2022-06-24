package com.shiftkey.codingchallenge.model.data

import com.google.gson.annotations.SerializedName


data class Shifts (

  @SerializedName("shift_id"                   ) var shiftId                 : Int?                = null,
  @SerializedName("start_time"                 ) var startTime               : String?             = null,
  @SerializedName("end_time"                   ) var endTime                 : String?             = null,
  @SerializedName("normalized_start_date_time" ) var normalizedStartDateTime : String?             = null,
  @SerializedName("normalized_end_date_time"   ) var normalizedEndDateTime   : String?             = null,
  @SerializedName("timezone"                   ) var timezone                : String?             = null,
  @SerializedName("premium_rate"               ) var premiumRate             : Boolean?            = null,
  @SerializedName("covid"                      ) var covid                   : Boolean?            = null,
  @SerializedName("shift_kind"                 ) var shiftKind               : String?             = null,
  @SerializedName("within_distance"            ) var withinDistance          : Int?                = null,
  @SerializedName("facility_type"              ) var facilityType            : FacilityType?       = FacilityType(),
  @SerializedName("skill"                      ) var skill                   : Skill?              = Skill(),
  @SerializedName("localized_specialty"        ) var localizedSpecialty      : LocalizedSpecialty? = LocalizedSpecialty()

)