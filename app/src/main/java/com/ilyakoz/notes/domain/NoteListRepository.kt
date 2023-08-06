package com.ilyakoz.notes.domain

import androidx.lifecycle.LiveData

interface NoteListRepository {

    fun addNoteItem(noteItem: NoteItem)

    fun deleteNoteItem(noteItem: NoteItem)

    fun editNoteItem(noteItem: NoteItem) : Boolean

    fun getNoteItem(noteItemId: Int) : NoteItem

    fun getNoteList() : LiveData<List<NoteItem>>
}