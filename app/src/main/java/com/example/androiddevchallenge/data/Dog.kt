package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Dog(
    val name: String,
    val age: String,
    val gender: String,

    @DrawableRes
    val picture: Int,
)