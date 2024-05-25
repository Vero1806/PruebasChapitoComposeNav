package com.example.pruebaschapito
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel : ViewModel() {
    private val _text = MutableLiveData("This is the second screen")
    val text: LiveData<String> = _text
}