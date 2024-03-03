package com.ahmed_apps.dictionary_app.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ahmed_apps.dictionary_app.R

val font = FontFamily(
    Font(R.font.font, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = font,
        fontSize = 16.sp,
    )

)