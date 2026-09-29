package com.example.nasaspaceimages.domain.model

data class SpaceImage (
    val id: Long,
    val nasaId: String,
    val title: String,
    val description: String,
    val dateCreated: String,
    val type: MediaType,
    val imageUrl: String,
    val keywords: List<String>,
    val comment: String,
    val isFavorite: Boolean
)