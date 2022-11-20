package com.example.marvelapp.framework.di

import com.espezzialy.core.data.repository.CharactersRemoteDataSource
import com.espezzialy.core.data.repository.CharactersRepository
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import com.example.marvelapp.framework.remote.RetrofitCharactersDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindCharacterRepository(repository: CharactersRepositoryImpl): CharactersRepository

    @Binds
    fun bindRemoteDataSouce(dataSource: RetrofitCharactersDataSource): CharactersRemoteDataSource<DataWrapperResponse>
}