package app

import kotlin.coroutines.*
import androidx.compose.foundation.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.unit.*

@Composable
fun DesktopApp(
  title : String,
  size : IntSize,
  ui: @Composable () -> Unit,
  dataframe: Unit? = null
){
  Window(
    title = title,
    size = size
  ){
    ui()
  }
}

fun main() = DesktopApp(
  title = "Desktop App",
  size = IntSize(1000.dp, 600.dp)
){
  UI()
}

@Composable
fun UI() {
  Box(
    Modifier.fillMaxSize(),
    color = Color.White
  )
}

