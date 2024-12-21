package com.example.surfacecoreui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.surfacecoreui.ui.theme.SurfaceCoreUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
MainScreen()
                }
            }
        }


@Composable
fun MainScreen(){
    Surface(color = Color.DarkGray,
        modifier = Modifier.fillMaxSize())
    {
Surface(color = Color.Magenta, modifier = Modifier.wrapContentSize(align = Alignment.TopCenter)) {
    Text(text = "Wrapped Content",
       // modifier = Modifier.wrapContentSize(),
        style = MaterialTheme.typography.headlineLarge)
}
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewDefault()
{
    MainScreen()
}

