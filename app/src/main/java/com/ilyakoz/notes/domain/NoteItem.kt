package com.ilyakoz.notes.domain


data class NoteItem(
    val id : Int,
    val title: String,
    val description : String,
    val enable : Boolean
)