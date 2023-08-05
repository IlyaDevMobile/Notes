package com.ilyakoz.notes.domain

class EditNoteItemUseCase(private val noteListRepository: NoteListRepository) {

    fun editNoteItem(noteItem: NoteItem){

        noteListRepository.editNoteItem(noteItem)

    }
}