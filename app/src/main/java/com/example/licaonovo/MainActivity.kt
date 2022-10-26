package com.example.licaonovo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.licaonovo.ui.theme.LicaoNovoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MessageCard("Android")// método message card recebe name Android como paramêtro

        }
    }
}
@Composable
fun MessageCard(name:String){  // name é declarado como string
    Text(text= "Hello $name!") // o comando text exibe a mensagem "Hello" e concatena a string name
}

@Preview // usado para exibir uma preview da tela
@Composable

fun PreviewMessageCard(){ // método usado para exibir a preview já que o comando não não pode ser exibido diretamente pela anotação @preview
    MessageCard("Android")
}


