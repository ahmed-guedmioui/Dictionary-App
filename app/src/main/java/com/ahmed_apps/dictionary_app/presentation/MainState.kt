package com.ahmed_apps.dictionary_app.presentation

import com.ahmed_apps.dictionary_app.domain.model.WordItem

/**
 * @author Ahmed Guedmioui
 */
data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)
