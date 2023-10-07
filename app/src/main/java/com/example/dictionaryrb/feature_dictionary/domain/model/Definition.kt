package com.example.dictionaryrb.feature_dictionary.domain.model

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<Any>
)