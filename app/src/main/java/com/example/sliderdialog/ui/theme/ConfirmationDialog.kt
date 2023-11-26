package com.example.sliderdialog.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun ConfirmationDialog(
    show: Boolean,
    onDismiss: () -> Unit,
    onOk: (texto: String) -> Unit,
    salir: () -> Unit
) {
    if (show) {
        Dialog(onDismissRequest = { onDismiss() }) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                TitleDialog(text = "Opciones", modifier = Modifier.padding(24.dp))
                Divider(Modifier.fillMaxWidth(), color = Color.LightGray)
                var selected by rememberSaveable {
                    mutableStateOf("Opción A")
                }
                RadioButtonList(name = selected, onItemSelected = { selected = it })
                Divider(modifier = Modifier.fillMaxWidth(), color = Color.LightGray)
                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(8.dp)
                ) {
                    TextButton(onClick = {
                        onOk("cancel")
                        salir()
                    }) {
                        Text(text = "CANCEL")
                    }

                    TextButton(onClick = {
                        onOk(selected)
                        salir()
                    }) {
                        Text(text = "OK")
                    }
                }
            }
        }
    }
}

@Composable
fun PrintConfirmationDialog() {
    var show by rememberSaveable {
        mutableStateOf(false)
    }
    var texto by rememberSaveable {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Button(onClick = { show = true }) {
            Text(text = "Mostrar")
        }
        ConfirmationDialog(show = show,
            onDismiss = { show = false },
            onOk = { texto = it },
            salir = { show = false })        
    }
    
    Text(text = texto)
}





















