package com.rozie.reminder

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize // voor doorgeven data.
@Entity(tableName = "reminderTable")
data class Reminder(

    @ColumnInfo(name = "reminder")
    var reminder: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
) : Parcelable
