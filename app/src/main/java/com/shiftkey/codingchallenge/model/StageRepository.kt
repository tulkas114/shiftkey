package com.shiftkey.codingchallenge.model

import com.shiftkey.codingchallenge.model.data.AvaialbleShiftListResponse
import com.shiftkey.codingchallenge.model.data.Shifts

class StageRepository (){
    suspend fun getAvailableShiftsList(address: String, start: String, end: String, type: String="week", radius: String = "150") : List<Shifts>{
        val options = hashMapOf(address to "address", type to "type", radius to "radius", start to "start", end to "end")
        val response : AvaialbleShiftListResponse = RetrofitBuilder.service.getAvailableShiftsList(options)
        val list : List<Shifts> = response.data.get(0).shifts
        return list

    }
    suspend fun getAvailableShiftsListItem(address: String, start: String, end: String, type: String="week", radius: String = "150") : List<ShiftItem>{
        return getAvailableShiftsList(address,start,end,type,radius).map { StageRepository.shiftToItem(it) }
    }

    companion object{
        fun shiftToItem(shift: Shifts): ShiftItem {
            return ShiftItem(
                shift.shiftId,
                shift.normalizedStartDateTime,
                shift.normalizedEndDateTime,
                shift.facilityType?.name,
                shift.localizedSpecialty?.name
            )
        }
    }

}