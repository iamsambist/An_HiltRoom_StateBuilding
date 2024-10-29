package com.sunaa.roomcontract.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.sunaa.roomcontract.room.entity.Contact
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {

        @Upsert
        suspend fun upsertContract(contract: Contact)
        // Upsert in single annotation for Insert and Update and entity in room

        @Delete
        suspend fun deleteContract(contract: Contact)

       @Query("SELECT * FROM contact ORDER BY firstName ASC")
        fun getContactsOrderedByFirstName(): Flow<List<Contact>>

        @Query("SELECT * FROM contact ORDER BY lastName ASC")
        fun getContactsOrderedByLastName(): Flow<List<Contact>>

        @Query("SELECT * FROM contact ORDER BY phoneNumber ASC")
        fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>>
}