import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColumnBarChart(
    modifier: Modifier,
    onDataChanged: (Number) -> Unit,
    color: Color,
    data: List<Number>
){

    // To create the chart, you need to insert it inside a Surface.
    // That said, the developer has complete freedom as to the customization of the same

    LazyRow(
        Modifier.fillMaxSize(0.95F),
        horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.Bottom
    ){
        data.forEach {bar ->

            Surface(
                modifier = modifier,
                color = color
            ){
                LazyColumn(
                    Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){ Text(
                    text = bar.toString(),
                    color = Color.Gray,
                    fontSize = 11.sp
                )}
            }
        }
    }
}

