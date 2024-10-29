package com.sunaa.roomcontract.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sunaa.roomcontract.room.dao.ContactDao
import com.sunaa.roomcontract.room.entity.Contact

@Database(
    entities = [Contact::class],
    version = 1,
    exportSchema = false
)
abstract class ContactDatabase : RoomDatabase(){
    abstract val dao : ContactDao
}