package io.svechnikov.mvvmtemplate.core.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.svechnikov.mvvmtemplate.features.MainActivity
import io.svechnikov.mvvmtemplate.features.entry.EntryFragment

@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector(modules = [MainActivityFragmentsModule::class])
    abstract fun mainActivity(): MainActivity
}

@Module
abstract class MainActivityFragmentsModule {
    @ContributesAndroidInjector
    abstract fun entryFragment(): EntryFragment
}