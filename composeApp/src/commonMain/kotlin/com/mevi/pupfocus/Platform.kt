package com.mevi.pupfocus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform