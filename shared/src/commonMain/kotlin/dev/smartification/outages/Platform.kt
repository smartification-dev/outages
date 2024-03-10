package dev.smartification.outages

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform