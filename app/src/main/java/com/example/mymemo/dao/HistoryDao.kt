package com.example.mymemo.dao

import androidx.room.*
import com.example.mymemo.model.Memo
import java.util.concurrent.Flow

@Dao
interface MemoDao {
    @Query("SELECT * FROM memo")
    suspend fun getAll(): List<Memo>

    @Delete
    suspend fun delete(memo: Memo)

    @Insert
    suspend fun insertMemo(memo: Memo)

    @Update
    suspend fun updateUsers(vararg memo: Memo)

    @Delete
    suspend fun deleteUsers(vararg memo: Memo)
}