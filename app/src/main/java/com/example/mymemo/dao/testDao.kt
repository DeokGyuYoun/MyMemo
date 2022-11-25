package com.example.mymemo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mymemo.model.test
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): Flow<List<test.Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: test.Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}