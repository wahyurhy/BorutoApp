package com.wahyurhy.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.wahyurhy.borutoapp.data.local.dao.HeroDao
import com.wahyurhy.borutoapp.data.local.dao.HeroRemoteKeyDao
import com.wahyurhy.borutoapp.domain.model.Hero
import com.wahyurhy.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}