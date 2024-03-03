package com.ahmed_apps.dictionary_app.presentation

/**
 * @author Ahmed Guedmioui
 */
sealed class MainUiEvents {
    data class OnSearchWordChange(
        val newWord: String
    ) : MainUiEvents()

    object OnSearchClick : MainUiEvents()
}