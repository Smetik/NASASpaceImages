package com.example.nasaspaceimages.data.remote.dto


data class SpaceImageDto (
    val center: String,
    val dateCreated: String,
    val description: String,
    val keywords: List<String>,
    val mediaType : String,
    val nasaId: String,
    val title: String
)