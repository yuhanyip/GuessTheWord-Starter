package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private lateinit var viewModel: ScoreViewModel
    private lateinit var viewModelFactory: ScoreViewModelFactory

    // The final score
    private val _score = MutableLiveData<Int>()
    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain
    val score: LiveData<Int>
        get() = _score
    init {
        _score.value = finalScore
    }
    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }
    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }


}