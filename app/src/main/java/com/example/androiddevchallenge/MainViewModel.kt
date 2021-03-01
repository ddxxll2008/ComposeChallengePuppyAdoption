package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Dog

class MainViewModel : ViewModel() {
    val dogs by mutableStateOf(
        listOf(
            Dog("AA", "1", "female", R.drawable.aa),
            Dog("BB", "1", "female", R.drawable.bb),
            Dog("CC", "1", "male", R.drawable.cc),
            Dog("DD", "1", "male", R.drawable.dd),
            Dog("EE", "1", "female", R.drawable.ee),
            Dog("FF", "1", "male", R.drawable.ff),
            Dog("GG", "1", "female", R.drawable.gg),
            Dog("HH", "1", "male", R.drawable.hh),
            Dog("II", "1", "male", R.drawable.ii),
            Dog("JJ", "1", "female", R.drawable.jj),
        )
    )

    var currentDog: Dog? by mutableStateOf(null)

    fun showDog(dog: Dog) {
        currentDog = dog
    }

    fun closeDog() {
        currentDog = null
    }
}