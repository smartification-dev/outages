package dev.smartification.outages.ui.home

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

object HomeScreen : Screen {

    @Composable
    override fun Content() {
        HomeContent()
    }
}