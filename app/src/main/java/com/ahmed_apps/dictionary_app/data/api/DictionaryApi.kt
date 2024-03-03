package com.ahmed_apps.dictionary_app.data.api

import com.ahmed_apps.dictionary_app.data.dto.WordResultDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author Ahmed Guedmioui
 */
interface DictionaryApi {

    @GET("{word}")
    suspend fun getWordResult(
        @Path("word") word: String
    ): WordResultDto?

    companion object {
        const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    }

}


















