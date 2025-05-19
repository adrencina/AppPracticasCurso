package com.example.appnavega.ui.screens.camera

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CameraViewmodel: ViewModel() {

    var nameimput by mutableStateOf("")
    private set

    var confirmedname by mutableStateOf("")
    private set

    fun onNameChange(newName: String) {
        nameimput = newName
    }

    fun onConfirmName() {
        confirmedname = nameimput
    }


}