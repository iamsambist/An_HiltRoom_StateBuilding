package com.sunaa.roomcontract.room.repo

import com.sunaa.roomcontract.room.entity.Contact
import kotlinx.coroutines.flow.Flow

interface ContactRepoInterface {
    suspend fun upsertContact(contact: Contact)
    suspend fun deleteContact(contact: Contact)

    fun getContactsOrderedByFirstName(): Flow<List<Contact>>

    fun getContactsOrderedByLastName(): Flow<List<Contact>>

    fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>>
}