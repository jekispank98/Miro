package com.jmtgroup.datasource.di

import com.jmtgroup.datasource.database.PillsDatabase
import android.content.Context
import com.jmtgroup.datasource.LocalSourceImpl
import com.jmtgroup.datasource.database.PillsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
class DataSourceModule {

    @Provides
    @Singleton
    fun providesPillsDatabase(@ApplicationContext context: Context) =
        PillsDatabase.getPillsDataBase(context)

    @Provides
    fun providesDao(pillsDatabase: PillsDatabase) = pillsDatabase.pillsDao()

    @Provides
    fun providesLocalSourceImpl(pillsDao: PillsDao) = LocalSourceImpl(pillsDao)
}
