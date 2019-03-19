package com.jkozal.arch.model.shape.room

import androidx.room.Entity
import com.jkozal.arch.lib.Shape

@Entity(primaryKeys = ["id"])
class ShapeRoomEntity(
    id: Int, name: String): Shape(id, name)
