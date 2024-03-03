package com.ahmed_apps.dictionary_app.domain.repository

import com.ahmed_apps.dictionary_app.domain.model.WordItem
import com.ahmed_apps.dictionary_app.util.Result
import kotlinx.coroutines.flow.Flow


/**
 * @author Ahmed Guedmioui
 */
interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}