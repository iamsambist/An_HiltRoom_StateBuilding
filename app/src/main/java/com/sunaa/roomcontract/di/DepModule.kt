package com.sunaa.roomcontract.di

import android.content.Context
import androidx.room.Room
import com.sunaa.roomcontract.room.ContactDatabase
import com.sunaa.roomcontract.room.dao.ContactDao
import com.sunaa.roomcontract.room.repo.ContactRepoImp
import com.sunaa.roomcontract.room.repo.ContactRepoInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DepModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appcontext: Context): ContactDatabase {
        return Room.databaseBuilder(
            appcontext,
            ContactDatabase::class.java,
            "contact_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideContractDao(database: ContactDatabase): ContactDao {
        return database.dao
    }

    @Provides
    @Singleton
    fun provideContactRepo(contactDao: ContactDao): ContactRepoInterface {
        return ContactRepoImp(contactDao)
    }
}