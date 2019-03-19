package com.jkozal.arch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jkozal.arch.domain.shape.di.DaggerShapeDomainComponent
import com.jkozal.arch.domain.shape.uc.GetShapeUC
import com.jkozal.arch.domain.shape.uc.InsertShapeUC
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var shapeGetUC: GetShapeUC

    @Inject
    lateinit var shapeInsertUC: InsertShapeUC

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerMainActivityComponent.builder()
            .shapeDomainComponent(DaggerShapeDomainComponent.builder().build())
            .build().inject(this)
    }
}
