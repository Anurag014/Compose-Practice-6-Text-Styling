package com.example.cp6textstyling

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

val fontFamily = FontFamily(
    Font(R.font.tiro_devanagari_hindi_regular, FontWeight.Normal),
    Font(R.font.tiro_devanagari_hindi_italic, FontWeight.Black)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TextStyling()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextStyling() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF101010))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp
                        )
                    ) {
                                  append("जेटपैक कंपोज़")
                    }
                    append(" का उपयोग करके मैंने यह असाधारण टेक्स्ट स्टाइल दिया है")
                },
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 30.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Italic,
                textDecoration = TextDecoration.Underline
            )
            Text(
                text = buildAnnotatedString {
                    append("I have given this extraordinary text styling using ")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Red,
                            fontSize = 50.sp
                        )
                    ) {
                        append("J")
                    }
                    append("etpack")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Red,
                            fontSize = 50.sp
                        )
                    ) {
                        append("C")
                    }
                    append("ompose")
                },
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 30.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Italic,
                textDecoration = TextDecoration.Underline
            )
        }
    }
}

