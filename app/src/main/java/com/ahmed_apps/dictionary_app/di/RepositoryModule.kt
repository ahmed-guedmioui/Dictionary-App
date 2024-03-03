package com.ahmed_apps.dictionary_app.di

import com.ahmed_apps.dictionary_app.data.repository.DictionaryRepositoryImpl
import com.ahmed_apps.dictionary_app.domain.repository.DictionaryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Ahmed Guedmioui
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindDictionaryRepository(
        dictionaryRepositoryImpl: DictionaryRepositoryImpl
    ): DictionaryRepository

}
























