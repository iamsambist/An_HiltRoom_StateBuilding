package com.sunaa.roomcontract

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.sunaa.roomcontract.ui.theme.RoomContractTheme
import com.sunaa.roomcontract.ui.view.ContactScreenView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RoomContractTheme {
                ContactScreenView()
            }
        }
    }
}
