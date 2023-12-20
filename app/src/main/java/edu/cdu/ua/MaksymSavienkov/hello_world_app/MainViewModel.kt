package edu.cdu.ua.MaksymSavienkov.hello_world_app

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(fieldValue: String) : ViewModel() {

    var fieldLive = MutableLiveData<String>()

    init {
        Log.e("AAA", "VM Created")
        fieldLive.value = fieldValue
    }

    override fun onCleared() {
        Log.e("AAA", "VM Cleared")
        super.onCleared()
    }

    fun changeToCaps() {
        fieldLive.value = fieldLive.value.toString().uppercase()
    }
}