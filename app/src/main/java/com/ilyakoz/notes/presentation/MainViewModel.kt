package com.ilyakoz.notes.presentation

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ilyakoz.notes.data.NoteListRepositoryImpl
import com.ilyakoz.notes.domain.DeleteNoteItemUseCase
import com.ilyakoz.notes.domain.EditNoteItemUseCase
import com.ilyakoz.notes.domain.GetNoteListUseCase
import com.ilyakoz.notes.domain.NoteItem

class MainViewModel : ViewModel() {

    private val repository = NoteListRepositoryImpl

    private val getNoteListUseCase = GetNoteListUseCase(repository)
    private val editNoteItemUseCase = EditNoteItemUseCase(repository)
    private val deleteNoteItemUseCase = DeleteNoteItemUseCase(repository)

    val noteList = MutableLiveData<List<NoteItem>>()



    fun deleteNoteItem(noteItem: NoteItem){
        deleteNoteItemUseCase.deleteNoteItem(noteItem)
    }

    fun changeEnableState(noteItem: NoteItem){
        val newItem = noteItem.copy(enable = !noteItem.enable)
        editNoteItemUseCase.editNoteItem(newItem)
    }
}