package com.example.myapplication.ui.dashboard

import android.widget.ListView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {



    private val _text = MutableLiveData<String>().apply {
        value = "Jidkiy132"
    }
    val text: LiveData<String> = _text
}