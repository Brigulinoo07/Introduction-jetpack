
    package com.example.myapplication

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview

import java.nio.file.Files.size
import androidx.compose.ui.unit.dp as dp

    class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
MessageCard(Message("Android", "Jetpack Compose"))
        // criação das mensagens
        }
    }
}

    data class Message(val author:String, val body:String)
    // classe usada para exibir as informações na tela

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {//inicia uma linha e define o tamanho dela
        Image(
            painter = painterResource(R.drawable.dice_1),// imagem
                    contentDescription ="dado", // descrição da imagem
            modifier = Modifier.size(40.dp) // define o tamanhoda imagem
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp)) // espaço entre as colunas

        Column {
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(4.dp)) //espaço entre os textos
            Text(text = msg.body)
        }
    }
}
@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("lexi","Hey,take a look at Jetpack compose,it's great!") //
        // valores que estão nas imagens
    )

    }
