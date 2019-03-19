package com.jkozal.arch.domain.shape

import com.jkozal.arch.model.shape.api.ShapeRepository
import javax.inject.Inject

class ShapeDomain @Inject constructor(internal val repository: ShapeRepository)
