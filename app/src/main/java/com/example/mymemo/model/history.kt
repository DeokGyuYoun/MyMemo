package com.example.mymemo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Memo(
    @PrimaryKey var subject: String,
    @ColumnInfo var content: String?
)