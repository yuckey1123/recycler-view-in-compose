import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_view.ComposeViewItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposeViewScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("LazyColumn Compose") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    scrolledContainerColor = MaterialTheme.colorScheme.primary,
                )
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            ComposeItemList()
        }
    }
}

@Composable
private fun ComposeItemList() {
    val items = List(100) { index ->
        ComposeViewItem(
            title = "Item $index",
            description = "${index}番目のアイテムです"
        )
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items.size) { item ->
            ViewItem(
                title = items[item].title,
                description = items[item].description
            )
        }
    }
}

@Composable
private fun ViewItem(title: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(1.dp, Color.Gray)
            .padding(8.dp)
    ) {
        Text(
            text = title,
            fontSize = 30.sp
        )
        Text(
            text = description,
            fontSize = 15.sp
        )
    }
}
