package dev.smartification.outages.di

import org.koin.core.context.startKoin
import org.koin.ksp.generated.defaultModule

fun initKoin() {
    startKoin {
        defaultModule()
    }
}