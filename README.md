<img width=100% alt="Head" src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=180&section=header&animation=twinkling"/>


<div align="center">
  
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="src/resources/assets/Logo-Black.png">
    <img src="src/resources/assets/Logo-White.png">
  </picture>
  
</div>

[![Kotlin](https://img.shields.io/badge/Kotlin-1.8.20-blueviolet.svg?logo=kotlin)](http://kotlinlang.org)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.4.0-ff69b4)](http://kotlinlang.org)
[![GitHub License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

Kunzita is an Open-Source Component Library developed as an add-on to Jetpack Compose, offering a variety of customizable and useful components. Its goal is to help developers enhance their user interfaces and simplify the app development process.

With Kunzita, developers of all levels can easily create stunning user interfaces, as the library is designed to be accessible and easy to use. Moreover, the decision to make the library Open-Source allows developers to contribute to the project and extend the functionality of the components.

Whether you are a beginner or an experienced developer, Kunzita provides a simple and powerful solution for creating user interfaces. Give it a try and see how it can benefit your next project.

### Code Example:

```kotlin
import io.kunzita.charts.ColumnBarChart
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable


@Composable
fun app() {
    
    var list = listOf(22, 55, 42, 86, 70)
    
    Surface {
        ColumnBarChart(
            modifier = Modifier.fillMaxSize(),
            color = Color.Magenta,
            data = list,
            onDataChanged = {}
        )
    }
}
```

<img width=100% alt="Footer" src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=170&section=footer&fontSize=42&fontColor=fff&animation=twinkling"/>
