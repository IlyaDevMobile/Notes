package com.ilyakoz.notes.domain

interface NoteListRepository {

    fun addNoteItem(noteItem: NoteItem)

    fun deleteNoteItem(noteItem: NoteItem)

    fun editNoteItem(noteItem: NoteItem) : Boolean

    fun getNoteItem(noteItemId: Int) : NoteItem

    fun getNoteList() : List<NoteItem>
}