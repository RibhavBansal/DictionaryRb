package com.example.dictionaryrb.feature_dictionary.domain.model

import com.example.dictionaryrb.feature_dictionary.domain.model.Definition

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
