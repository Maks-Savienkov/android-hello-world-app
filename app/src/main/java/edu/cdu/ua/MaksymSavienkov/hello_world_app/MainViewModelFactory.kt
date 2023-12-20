package edu.cdu.ua.MaksymSavienkov.hello_world_app

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(context: Context) : ViewModelProvider.Factory {

    private val fieldValue = context.getString(R.string.text_activity_1)
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            fieldValue = fieldValue
        ) as T
    }
}