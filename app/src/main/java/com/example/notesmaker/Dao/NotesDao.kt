package com.example.notesmaker.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.notesmaker.Model.Notes

@Dao
interface NotesDao {

    @Query("Select * from Notes")

    fun getNotes(): LiveData<List<Notes>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(notes: Notes)

    @Query("DELETE FROM Notes WHERE id=id")
    fun deleteNotes(id: Int)

    @Update()
    fun updateNotes(notes: Notes)
}