package com.example.tugas5.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tugas5.data.model.ResponseUserGithub

@Database(entities = [ResponseUserGithub.Item::class], version = 1, exportSchema = false)
abstract class AppDb : RoomDatabase() {
    abstract fun userDao(): UserDao
}