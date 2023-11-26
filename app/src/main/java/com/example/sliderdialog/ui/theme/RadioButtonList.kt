package com.example.sliderdialog.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RadioButtonList(name: String, onItemSelected: (String) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(selected = name == "Opción A", onClick = {
                onItemSelected("Opción A")
            })
            Text(text = "Opción A")

        }
        Row(
            modifier = Modifier.padding(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(selected = name == "Opción B", onClick = {
                onItemSelected("Opción B")
            })
            Text(text = "Opción B")

        }
        Row(
            modifier = Modifier.padding(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(selected = name == "Opción C", onClick = {
                onItemSelected("Opción C")
            })
            Text(text = "Opción C")

        }
    }
}