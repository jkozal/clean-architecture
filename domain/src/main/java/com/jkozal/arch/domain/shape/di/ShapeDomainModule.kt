package com.jkozal.arch.domain.shape.di

import com.jkozal.arch.domain.shape.ShapeDomain
import com.jkozal.arch.model.shape.api.ShapeRepository
import com.jkozal.arch.model.shape.room.ShapeRoomModule
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module(includes = [ShapeRoomModule::class])
class ShapeDomainModule {

    @Provides
    @Inject
    fun provideDomain(repo: ShapeRepository): ShapeDomain {
        return ShapeDomain(repo)
    }
}
