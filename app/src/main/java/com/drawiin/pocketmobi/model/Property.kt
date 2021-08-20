package com.drawiin.pocketmobi.model

data class Property(
    val address: String,
    val owner: String,
    val squareMeters: Int,
    val value: Boolean,
    val commissionPercentage: Float
)