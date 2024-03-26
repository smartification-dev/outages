package dev.smartification.outages

import android.app.Application
import dev.smartification.outages.di.initKoin

class OutagesApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}
