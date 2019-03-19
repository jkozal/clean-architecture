package com.jkozal.arch.domain.shape.uc

import com.jkozal.arch.domain.shape.ShapeDomain
import com.jkozal.arch.lib.Shape
import javax.inject.Inject

class InsertShapeUC @Inject constructor(private val domain: ShapeDomain) {

    fun execute(shape: Shape) {
        domain.repository.insert(shape)
    }
}
