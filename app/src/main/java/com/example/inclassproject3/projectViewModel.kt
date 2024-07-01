package com.example.inclassproject3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class projectViewModel : ViewModel(){
    private val _name = MutableLiveData<String> ("")
    val name : LiveData<String> get() = _name

    fun setName (name : String){
        _name.value = name

    }

}