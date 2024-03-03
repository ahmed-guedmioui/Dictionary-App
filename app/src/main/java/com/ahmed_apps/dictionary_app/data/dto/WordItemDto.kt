package com.ahmed_apps.dictionary_app.data.dto

data class WordItemDto(
    val meanings: List<MeaningDto>? = null,
    val phonetic: String? = null,
    val word: String? = null
)