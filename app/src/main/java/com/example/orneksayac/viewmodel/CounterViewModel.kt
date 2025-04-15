package com.example.orneksayac.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.orneksayac.model.Counter

class CounterViewModel: ViewModel(){

    private  var counter = Counter(0)

    var count: Int by  mutableStateOf(counter.value)
        private set


    fun increment(){

        counter = counter.copy(value = counter.value +1)
        count=counter.value

    }

}