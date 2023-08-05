package com.ilyakoz.notes.domain

class EditNoteItemUseCase(private val noteListRepository: NoteListRepository) {

    fun editNoteItem(noteItem: NoteItem) : Boolean{

        return noteListRepository.editNoteItem(noteItem)

    }
}