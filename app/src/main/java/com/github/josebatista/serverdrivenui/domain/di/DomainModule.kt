package com.github.josebatista.serverdrivenui.domain.di

import com.github.josebatista.serverdrivenui.domain.usecase.FetchMainUiUseCase
import com.github.josebatista.serverdrivenui.domain.usecase.FetchMainUiUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class DomainModule {

    @Binds
    @ViewModelScoped
    abstract fun bindFetchMainUiUseCase(
        fetchMainUiUseCaseImpl: FetchMainUiUseCaseImpl,
    ): FetchMainUiUseCase
}