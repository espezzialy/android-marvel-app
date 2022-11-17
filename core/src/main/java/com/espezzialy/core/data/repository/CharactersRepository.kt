package com.espezzialy.core.data.repository

import androidx.paging.PagingSource
import com.espezzialy.core.domain.model.Character


interface CharactersRepository {

    fun getCharacters(query: String): PagingSource<Int, Character>
}