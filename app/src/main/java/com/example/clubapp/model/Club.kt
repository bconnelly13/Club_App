package com.example.clubapp.model

import androidx.annotation.DrawableRes

data class Club(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val daysOfWeek: MutableList<String> = mutableListOf(),
    val myClub: Boolean
)