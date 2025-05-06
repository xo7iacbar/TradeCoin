package com.example.tradecoin.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tradecoin.Data.Network.ConversionInfo
import com.example.tradecoin.Data.Network.DataItem
import com.example.tradecoin.Data.Network.Servise

@Database(entities = [ConversionInfo::class], version = 1, exportSchema = true)
abstract class AppDatabase: RoomDatabase() {
    abstract  fun getService(): Servise
    companion object {
        fun getDb(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "my.db")
                .allowMainThreadQueries().build()
        }
    }
}