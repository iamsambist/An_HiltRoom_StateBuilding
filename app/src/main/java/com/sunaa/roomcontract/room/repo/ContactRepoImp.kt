package com.sunaa.roomcontract.room.repo

import com.sunaa.roomcontract.room.dao.ContactDao
import com.sunaa.roomcontract.room.entity.Contact
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ContactRepoImp @Inject constructor(
    private val contactDao: ContactDao
) : ContactRepoInterface {
    override suspend fun upsertContact(contact: Contact) {
        contactDao.upsertContract(contact)
    }

    override suspend fun deleteContact(contact: Contact) {
        contactDao.deleteContract(contact)
    }

    override fun getContactsOrderedByFirstName(): Flow<List<Contact>> {
        return contactDao.getContactsOrderedByFirstName()
    }

    override fun getContactsOrderedByLastName(): Flow<List<Contact>> {
        return contactDao.getContactsOrderedByLastName()
    }

    override fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>> {
        return contactDao.getContactsOrderedByPhoneNumber()
    }
}