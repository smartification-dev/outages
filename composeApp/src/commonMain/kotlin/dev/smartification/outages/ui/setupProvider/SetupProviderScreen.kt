package dev.smartification.outages.ui.setupProvider

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel

data class SetupProviderScreen(val provider: String) : Screen {

    @Composable
    override fun Content() {
        val screenModel = getScreenModel<SetupProviderScreenModel>()
        SetupProviderContent(screenModel, provider)
    }
}