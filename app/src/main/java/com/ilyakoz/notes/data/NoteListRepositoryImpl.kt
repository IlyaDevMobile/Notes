package com.ilyakoz.notes.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ilyakoz.notes.domain.NoteItem
import com.ilyakoz.notes.domain.NoteListRepository

object NoteListRepositoryImpl : NoteListRepository {

    private val noteList = mutableListOf<NoteItem>()

    private val noteListLd = MutableLiveData<List<NoteItem>>()

    private var autoIncrementId = 0

    init {
        for (i in 0 until 10){
            val item = NoteItem("Название $i", "описание $i",true )
            addNoteItem(item)
        }
    }


    override fun addNoteItem(noteItem: NoteItem) {
        if (noteItem.id == NoteItem.UNDEFINED_ID){
            noteItem.id = autoIncrementId++
        }
        noteList.add(noteItem)
        updateList()
    }

    override fun deleteNoteItem(noteItem: NoteItem) {
        noteList.remove(noteItem)
        updateList()
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

    override fun getNoteList(): LiveData<List<NoteItem>> {
        return noteListLd
    }

    private fun updateList(){
        noteListLd.value = noteList.toList()
    }
}