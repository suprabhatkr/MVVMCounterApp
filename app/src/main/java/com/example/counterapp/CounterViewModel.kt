package com.example.counterapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel


class CounterViewModel: ViewModel() {

    private val _counterRepository = CounterRepository()
    private var _count =  mutableIntStateOf(_counterRepository.getCount())

    val count : MutableIntState = _count

    fun increment() {
        _counterRepository.incrementCounter()
        _count.intValue = _counterRepository.getCount()
    }

    fun decrement() {
        _counterRepository.decrementCounter()
        _count.intValue = _counterRepository.getCount()
    }

}