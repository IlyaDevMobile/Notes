package com.ilyakoz.notes.data

import com.ilyakoz.notes.domain.NoteItem
import com.ilyakoz.notes.domain.NoteListRepository

object NoteListRepositoryImpl : NoteListRepository {

    private val noteList = mutableListOf<NoteItem>()

    private var autoIncrementId = 0


    override fun addNoteItem(noteItem: NoteItem) {
        if (noteItem.id == NoteItem.UNDEFINED_ID){
            noteItem.id = autoIncrementId++
        }
        noteList.add(noteItem)
    }

    override fun deleteNoteItem(noteItem: NoteItem) {
        noteList.remove(noteItem)
    }

    override fun editNoteItem(noteItem: NoteItem) : Boolean {
        val index = noteList.indexOfFirst { it.id  == noteItem.id }
        return if (index != - 1){
            noteList[index] = noteItem
            true
        } else {
            false
        }
    }

    override fun getNoteItem(noteItemId: Int): NoteItem {
        return noteList.find {
            it.id == noteItemId
        } ?: throw NoSuchElementException("Element with id $noteItemId not found")
    }

    override fun getNoteList(): List<NoteItem> {
        return noteList.toList()
    }
}