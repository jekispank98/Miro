package com.jmtgroup.datasource.di

import com.jmtgroup.datasource.database.PillsDatabase
import android.content.Context
import com.jmtgroup.datasource.LocalSourceImpl
import com.jmtgroup.datasource.database.PillsDao
import com.jmtgroup.pills.domain.LocalSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun providesPillsDatabase(@ApplicationContext context: Context) =
        PillsDatabase.getPillsDataBase(context)

    @Provides
    fun providesDao(pillsDatabase: PillsDatabase) = pillsDatabase.pillsDao()

    @Provides
    @Singleton
    fun provideLocalSource(pillsDao: PillsDao) : LocalSource {
        return LocalSourceImpl(pillsDao)
    }
//    @Provides
//    fun providesLocalSourceImpl(pillsDao: PillsDao) = LocalSourceImpl(pillsDao)
}
