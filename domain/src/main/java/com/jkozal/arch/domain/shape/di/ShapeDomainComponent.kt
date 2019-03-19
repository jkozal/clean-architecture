package com.jkozal.arch.domain.shape.di

import com.jkozal.arch.domain.shape.ShapeDomain
import dagger.Component

@Component(modules = [ShapeDomainModule::class])
interface ShapeDomainComponent {
    fun shapeDomain(): ShapeDomain
}
