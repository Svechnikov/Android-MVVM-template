package io.svechnikov.mvvmtemplate.core.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import io.svechnikov.mvvmtemplate.core.BaseApplication
import io.svechnikov.mvvmtemplate.core.di.modules.ActivitiesModule
import io.svechnikov.mvvmtemplate.core.di.modules.AppModule
import io.svechnikov.mvvmtemplate.core.di.modules.ViewModelModule
import javax.inject.Singleton

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivitiesModule::class,
    AppModule::class,
    ViewModelModule::class
]) @Singleton
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setApplication(context: Context): Builder
        fun build(): AppComponent
    }
    fun inject(baseApplication: BaseApplication)
}