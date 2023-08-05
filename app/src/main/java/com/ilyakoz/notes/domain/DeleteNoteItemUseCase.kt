package com.ilyakoz.notes.domain

class DeleteNoteItemUseCase(private val noteListRepository: NoteListRepository){

    fun deleteNoteItem(noteItem: NoteItem) {
        noteListRepository.deleteNoteItem(noteItem)
    }
}