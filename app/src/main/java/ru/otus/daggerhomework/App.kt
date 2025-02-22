package ru.otus.daggerhomework

import android.app.Application
import ru.otus.daggerhomework.dagger.ApplicationComponent
import ru.otus.daggerhomework.dagger.DaggerApplicationComponent
import ru.otus.daggerhomework.dagger.MainActivityComponent

class App :Application() {
    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.factory().create(this)
    }
}