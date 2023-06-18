package app

import kotlin.coroutines.*
import androidx.compose.foundation.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.unit.*
import app.*

object Desktop {

  fun App(val title: String) {
    Window(
      onExitRequest = ::exitApplication(),
      title = title,
      state = WindowState(size = DpSize(1000.dp, 600.dp), placement = WindowPlacement.Center)
    ){
      UI.render()
    }
  }

  fun exitApplication() {
    exitProcess(0)
  }
}
