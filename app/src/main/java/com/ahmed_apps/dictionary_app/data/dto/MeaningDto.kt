package com.ahmed_apps.dictionary_app.data.dto

data class MeaningDto(
    val definitions: List<DefinitionDto>? = null,
    val partOfSpeech: String? = null
)