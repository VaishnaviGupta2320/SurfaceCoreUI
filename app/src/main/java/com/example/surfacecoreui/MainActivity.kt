package com.example.surfacecoreui

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp
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
       Column(modifier = Modifier.fillMaxSize(),
           verticalArrangement =Arrangement.SpaceAround,
           horizontalAlignment = Alignment.CenterHorizontally)
       {
           Row(modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceEvenly) {
               Horizontalcolorbar(Color.Magenta)
               Horizontalcolorbar(Color.Green)
           }
           //Horizontalcolorbar(Color.Magenta)
          // Horizontalcolorbar(Color.Green)
           Horizontalcolorbar(Color.Blue)
           Horizontalcolorbar(Color.Cyan)
           Horizontalcolorbar(Color.Yellow)
//           Surface(
//               color = Color.Magenta,
//               modifier = Modifier.height(600.dp).width(100.dp)
//           ){ }
//           Surface(
//               color = Color.Green,
//               modifier = Modifier.height(600.dp).width(100.dp)
//           ){ }
//           Surface(
//               color = Color.Blue,
//               modifier = Modifier.height(600.dp).width(100.dp)
//           ){ }

       }

//Surface(color = Color.Magenta, modifier = Modifier.wrapContentSize(align = Alignment.TopCenter)) {
                //Text(text = "Wrapped Content",
                // modifier = Modifier.wrapContentSize(),
                //  style = MaterialTheme.typography.headlineLarge)
            }
        }

@Composable
fun Horizontalcolorbar(color: Color)
{
    Surface(
        color = color,
        modifier = Modifier.height(100.dp).width(100.dp)
    ){ }
}


@Preview(showBackground = true)
@Composable
fun PreviewDefault()
{
    MainScreen()
}

