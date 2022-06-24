package com.shiftkey.codingchallenge.viewmodel


import androidx.lifecycle.ViewModel
import com.shiftkey.codingchallenge.model.StageRepository
import kotlinx.coroutines.Dispatchers
import androidx.lifecycle.liveData
import com.shiftkey.codingchallenge.utils.Resource
import java.lang.Exception

class MainActivityViewModel : ViewModel() {
     var list = liveData(Dispatchers.IO){
        Resource.loading(data = null)
        try{
            emit(
                Resource.success(data = StageRepository().getAvailableShiftsListItem(
                    address = "Dallas, TX",
                    start = "2022-06-20",
                    end = "2022-06-21",
                    type = "week"
                )))
        }catch ( e: Exception){
            emit(Resource.error(data = null, message = e.message ?: "Error"))
        }
    }

}