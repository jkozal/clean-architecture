package com.jkozal.arch.model.shape.room

import com.jkozal.arch.model.shape.api.ShapeLocalDataStore
import com.jkozal.arch.model.shape.api.ShapeModule
import com.jkozal.arch.model.shape.api.ShapeRemoteDataStore
import com.jkozal.arch.model.shape.api.ShapeRepository
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class ShapeRoomModule: ShapeModule<ShapeRoomEntity> {

    @Provides
    override fun provideLocalDataStore(): ShapeLocalDataStore<ShapeRoomEntity> {
        return ShapeRoomLocalDataStore()
    }

    @Provides
    override fun provideRemoteDataStore(): ShapeRemoteDataStore<ShapeRoomEntity> {
        return ShapeRoomRemoteDataStore()
    }

    @Provides
    @Inject
    override fun provideRepository(
        localDS: ShapeLocalDataStore<ShapeRoomEntity>,
        remoteDS: ShapeRemoteDataStore<ShapeRoomEntity>): ShapeRepository {
        return ShapeRoomRepository(localDS, remoteDS)
    }
}
