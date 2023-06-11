
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
  UI: @Composable () -> Unit,
  dataframe: Unit
){
  Window(
    title = title,
    size = size
  ){
    UI()
  }
}





  






  




  

















  



  
















  



  











fun main() = MultiplatformAppFramework.startApp {
  // Define app here using Jetpack Compose and Kotlin
  Text("Hello, World!")
}
