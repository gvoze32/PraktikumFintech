package com.example.fintech.data.local.db

import android.content.Context
import androidx.room.*
import com.example.fintech.data.local.db.dao.FlowerDao
import com.example.fintech.data.local.db.model.FlowerEntity

@Database(entities = [FlowerEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun flowerDao(): FlowerDao
    companion object {
        private var instance: AppDatabase? = null
        fun newInstance(context: Context): AppDatabase = instance ?: Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "financeapp.db"
        ).build().also {
            instance = it
        }
    }
}