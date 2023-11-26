package com.example.sliderdialog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sliderdialog.ui.theme.PrintAlert
import com.example.sliderdialog.ui.theme.PrintConfirmationDialog
import com.example.sliderdialog.ui.theme.PrintCustomDialog01
import com.example.sliderdialog.ui.theme.PrintCustomDialog02
import com.example.sliderdialog.ui.theme.SliderDialogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SliderDialogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Slider01()
                    //AlertDialog(true)
                    //PrintAlert()
                    //PrintCustomDialog01()
                    //PrintCustomDialog02()
                    PrintConfirmationDialog()
                }
            }
        }
    }
}
