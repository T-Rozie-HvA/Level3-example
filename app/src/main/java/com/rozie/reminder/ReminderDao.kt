package com.rozie.reminder

import androidx.room.*

@Dao
interface ReminderDao {                 // Dao stat voor Database Access Object

    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)
}