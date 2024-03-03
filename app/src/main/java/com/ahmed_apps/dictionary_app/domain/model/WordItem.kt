package com.ahmed_apps.dictionary_app.domain.model


data class WordItem(
    val word: String,
    val meanings: List<Meaning>,
    val phonetic: String
)