package com.ilyakoz.notes.domain

interface NoteListRepository {

    fun addNoteItem(title: String, description: String): NoteItem

    fun deleteNoteItem(noteItem: NoteItem)

    fun editNoteItem(noteItem: NoteItem)

    fun getNoteItem(noteItemId: Int) : NoteItem

    fun getNoteList() : List<NoteItem>
}