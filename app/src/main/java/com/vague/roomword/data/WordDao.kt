package com.vague.roomword.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.vague.roomword.model.Word

@Dao
interface WordDao {

    @Insert
    suspend fun insert(word: Word)

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAllWords(): List<Word>

    @Query("DELETE FROM word_table")
    fun deleteAll()
}