import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import dev.smartification.outages.ui.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(HomeScreen)
    }
}