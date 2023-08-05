package com.ilyakoz.notes.domain

class AddNoteItemUseCase(private val noteListRepository: NoteListRepository) {

    fun addNoteItem(title: String, description: String): NoteItem{
        return  noteListRepository.addNoteItem(title,description)

    }
}