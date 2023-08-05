package com.ilyakoz.notes.domain

class AddNoteItemUseCase(private val noteListRepository: NoteListRepository) {

    fun addNoteItem(noteItem: NoteItem){
        noteListRepository.addNoteItem(noteItem)

    }
}