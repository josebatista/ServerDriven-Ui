package com.github.josebatista.serverdrivenui.data.di

import com.github.josebatista.serverdrivenui.data.repository.RepositoryImpl
import com.github.josebatista.serverdrivenui.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindRepository(repositoryImpl: RepositoryImpl): Repository
}