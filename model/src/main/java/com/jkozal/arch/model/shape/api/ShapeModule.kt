package com.jkozal.arch.model.shape.api

import com.jkozal.arch.lib.Shape

interface ShapeModule<T: Shape> {
    fun provideLocalDataStore(): ShapeLocalDataStore<T>
    fun provideRemoteDataStore(): ShapeRemoteDataStore<T>
    fun provideRepository(localDS: ShapeLocalDataStore<T>, remoteDS: ShapeRemoteDataStore<T>): ShapeRepository
}
