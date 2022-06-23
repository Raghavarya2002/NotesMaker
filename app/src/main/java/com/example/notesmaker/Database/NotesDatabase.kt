package com.example.notesmaker.Database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.notesmaker.Dao.NotesDao

abstract class NotesDatabase : RoomDatabase() {
    abstract fun myNotesDao(): NotesDao

    companion object {
        @Volatile
        var Instance: NotesDatabase? = null

        fun getDatabaseInstance(context: Context): NotesDatabase {
            val tempInstance = Instance
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val roomDatabaseInstance =
                    Room.databaseBuilder(context, NotesDatabase::class.java, "Notes").build()
                Instance = roomDatabaseInstance
                return roomDatabaseInstance
            }
        }
    }
}