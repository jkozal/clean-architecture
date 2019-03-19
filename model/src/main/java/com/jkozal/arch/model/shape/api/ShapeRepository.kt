package com.jkozal.arch.model.shape.api

import com.jkozal.arch.lib.Shape

interface ShapeRepository {
    fun getShapeById(): Shape
    fun insert(shape: Shape)
}
