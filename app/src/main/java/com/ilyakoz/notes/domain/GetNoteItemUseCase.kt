package com.ilyakoz.notes.domain

class GetNoteItemUseCase(private val noteListRepository: NoteListRepository) {

    fun getNoteItem(noteItemId: Int) : NoteItem{
        return noteListRepository.getNoteItem(noteItemId)
    }
}