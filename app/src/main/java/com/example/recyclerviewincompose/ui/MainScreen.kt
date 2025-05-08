package com.example.recyclerviewincompose.ui

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.xml_view.XMLViewActivity

@Composable
fun MainScreen(
    navController: NavController
) {
    val context = LocalContext.current
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.statusBars.asPaddingValues())
            .padding(WindowInsets.navigationBars.asPaddingValues())
    ) {
        Column {
            XMLViewButton(onClick = {
                // XMLViewActivityへ遷移
                val intent = Intent(context, XMLViewActivity::class.java)
                context.startActivity(intent)
            })
            ComposeViewButton(onClick = {
                // ComposeViewScreenへ遷移
                navController.navigate("compose")
            })
        }
    }
}

@Composable
private fun XMLViewButton(onClick: () -> Unit) {
    Button(onClick = {
        onClick()
    }) {
        Text("Open XML Layout")
    }
}

@Composable
private fun ComposeViewButton(onClick: () -> Unit) {
    Button(onClick = {
        onClick()
    }) {
        Text("Open Compose Layout")
    }
}