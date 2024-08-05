package com.example.counterapp

data class CounterModel(var counter : Int = 0)

class CounterRepository() {

    private val _counterModel = CounterModel(0)

    fun getCount() : Int {
        return _counterModel.counter
    }

    fun incrementCounter() {
        _counterModel.counter++
    }

    fun decrementCounter() {
        _counterModel.counter--
    }
}