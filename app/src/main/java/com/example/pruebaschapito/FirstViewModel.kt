package com.example.pruebaschapito
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {
    private val _text = MutableLiveData("This is the first screen")
    val text: LiveData<String> = _text
}