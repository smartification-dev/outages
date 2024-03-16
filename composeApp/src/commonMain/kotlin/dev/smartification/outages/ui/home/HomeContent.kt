package dev.smartification.outages.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.smartification.outages.ui.setupProvider.SetupProviderScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import outages.composeapp.generated.resources.HomeSetupProviders
import outages.composeapp.generated.resources.Res

@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 24.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                text = stringResource(Res.string.HomeSetupProviders),
                style = MaterialTheme.typography.titleLarge,
            )
        }
        ProviderItem("Provider1")
    }
}

@Composable
private fun ProviderItem(provider: String, modifier: Modifier = Modifier) {
    val navigator = LocalNavigator.currentOrThrow
    Row(
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 56.dp)
            .clickable { navigator.push(SetupProviderScreen(provider)) }
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier.weight(1f),
            text = provider,
        )
        Icon(
            imageVector = Icons.Default.ChevronRight,
            contentDescription = null,
        )
    }
}
