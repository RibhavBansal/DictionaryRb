package com.example.dictionaryrb.feature_dictionary.data.remote.dto

data class WordInfoDto(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String
)