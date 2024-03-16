package dev.smartification.outages.ui.setupProvider

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

data class SetupProviderScreen(val provider: String) : Screen {

    @Composable
    override fun Content() {
        SetupProviderContent(provider)
    }
}