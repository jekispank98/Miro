package com.jmtgroup.pills.di

import com.jmtgroup.pills.domain.AddPillsUseCase
import com.jmtgroup.pills.domain.DeletePillsUseCase
import com.jmtgroup.pills.domain.GetAllPillsUseCase
import com.jmtgroup.pills.domain.LocalSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class PillsModule {



    @Provides
    fun provideAddPillsUseCase(localSource: LocalSource) = AddPillsUseCase(localSource)

    @Provides
    fun provideGetAllPillsUseCase(localSource: LocalSource) = GetAllPillsUseCase(localSource)

    @Provides
    fun provideDeletePillsUseCase(localSource: LocalSource) = DeletePillsUseCase(localSource)

}