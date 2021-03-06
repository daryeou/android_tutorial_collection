package kr.feliz.tutorial_collection.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application(){
    companion object{
        lateinit var instance: App
            private set
    }
    override fun onCreate() {
        super.onCreate()
        instance = this

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(dataModule)
        }
//        val handler = ApplicationLifecycleHandler()
//        registerActivityLifecycleCallbacks(handler)
//        registerComponentCallbacks(handler)
    }
}