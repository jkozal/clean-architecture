package com.jkozal.arch.domain.shape.uc

import com.jkozal.arch.domain.shape.ShapeDomain
import com.jkozal.arch.lib.Shape
import javax.inject.Inject

class GetShapeUC @Inject constructor(private val domain: ShapeDomain) {

    fun execute(shape: Shape): Shape {
        return domain.repository.getShapeById()
    }
}
