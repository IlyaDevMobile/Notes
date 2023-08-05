package com.ilyakoz.notes.domain


data class NoteItem(
    val title: String,
    val description : String,
    val enable : Boolean,
    var id : Int = UNDEFINED_ID
)
{

    companion object {
        const val UNDEFINED_ID = - 1
    }
}