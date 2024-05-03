import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.DragData
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var login by remember { mutableStateOf("") }
    var msg by remember { mutableStateOf("") }
    //login and accept
    Column {
        Row {
            Text("Введите Ваш логин: ")
            TextField(value = login, onValueChange = { login = it })
            Button(onClick = { pass() }) {
                Text("Принять")
            }
        }
        //messages
        Row {

        }
        //message and send message
        Row {
            TextField(modifier = Modifier, value = msg, onValueChange = { msg = it })
            Button(onClick = { pass() }) {
                Text("Отправить")
            }
        }
    }

}

fun pass() {

}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
