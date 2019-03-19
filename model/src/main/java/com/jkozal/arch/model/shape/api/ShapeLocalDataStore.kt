package com.jkozal.arch.model.shape.api

import com.jkozal.arch.lib.Shape

interface ShapeLocalDataStore<T: Shape> {
    fun getShapesByName(name: String): List<T>
    fun insert(shape: T)
}
