package com.example.notesmaker.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.notesmaker.Model.Notes

@Dao
interface NotesDao {

    @Query("Select * from Notes")

    fun getNotes(): LiveData<List<Notes>>


    @Query("Select * from Notes WHERE priority = 3")

    fun getHighNotes(): LiveData<List<Notes>>


    @Query("Select * from Notes WHERE priority = 2")

    fun getMediumNotes(): LiveData<List<Notes>>

    @Query("Select * from Notes WHERE priority = 1")

    fun getLowNotes(): LiveData<List<Notes>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(notes: Notes)

    @Query("DELETE FROM Notes WHERE id=:id")
    fun deleteNotes(id: Int)

    @Update()
    fun updateNotes(notes: Notes)
}