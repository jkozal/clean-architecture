package com.jkozal.arch

import com.jkozal.arch.domain.shape.di.ShapeDomainComponent
import dagger.Component

@Component(dependencies = [ShapeDomainComponent::class])
interface MainActivityComponent {
    fun inject(fragment: MainActivity)
}
