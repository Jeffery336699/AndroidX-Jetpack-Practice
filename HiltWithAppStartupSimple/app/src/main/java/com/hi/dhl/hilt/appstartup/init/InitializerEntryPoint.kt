package com.hi.dhl.hilt.appstartup.init

import android.content.Context
import com.hi.dhl.hilt.appstartup.data.WorkService
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.components.ApplicationComponent

/**
 * 外部的类的注入方式，并且想要享受hilt的依赖
 * 内部采用EntryPointAccessors.fromApplication构建应用级别的对象
 */

@EntryPoint
@InstallIn(ApplicationComponent::class)
interface InitializerEntryPoint {
    // 方式创建的接口，需要提供实现类，并采用@inject方式or @Provides注解 or @Binds注解
    fun injectWorkService(): WorkService

    companion object {
        fun resolve(context: Context): InitializerEntryPoint {

            val appContext = context.applicationContext ?: throw IllegalStateException()
            return EntryPointAccessors.fromApplication(
                appContext,
                InitializerEntryPoint::class.java
            )
        }
    }
}