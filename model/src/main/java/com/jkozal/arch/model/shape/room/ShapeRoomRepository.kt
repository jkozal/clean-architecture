package com.jkozal.arch.model.shape.room

import com.jkozal.arch.lib.Shape
import com.jkozal.arch.model.shape.api.ShapeLocalDataStore
import com.jkozal.arch.model.shape.api.ShapeRemoteDataStore
import com.jkozal.arch.model.shape.api.ShapeRepository

class ShapeRoomRepository(
    val localDS: ShapeLocalDataStore<ShapeRoomEntity>,
    val remoteDS: ShapeRemoteDataStore<ShapeRoomEntity>): ShapeRepository {

    override fun getShapeById(): Shape {
        TODO()
    }

    override fun insert(shape: Shape) {
        remoteDS.insert(shape as ShapeRoomEntity)
    }
}
