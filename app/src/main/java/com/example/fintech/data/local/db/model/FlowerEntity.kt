package com.example.fintech.data.local.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FlowerEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val FlowerName: String,
    val FlowerImageUrl: String
)