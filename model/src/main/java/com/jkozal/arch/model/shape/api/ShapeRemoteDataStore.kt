package com.jkozal.arch.model.shape.api

import com.jkozal.arch.lib.Shape

interface ShapeRemoteDataStore<T: Shape> {
    fun insert(shape: T)
}
