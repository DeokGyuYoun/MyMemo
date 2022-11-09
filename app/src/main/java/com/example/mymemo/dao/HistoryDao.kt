package com.example.mymemo.dao

import androidx.room.*
import com.example.mymemo.model.Memo
import com.example.mymemo.model.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): User

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}

@Dao
interface MemoDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<Memo>


}