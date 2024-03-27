package com.example.project5bitfitpart1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sleep_table")

data class SleepEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "SleepDate") val SleepDate: String?,
    @ColumnInfo(name = "didSleepGood") val didSleepGood: Boolean?
)