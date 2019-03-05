package io.svechnikov.mvvmtemplate.features.entry

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class EntryViewModel @Inject constructor(
    private val entryUseCase: EntryUseCase
): ViewModel() {
    private val stateMutable = MutableLiveData<EntryState>()
    val state: LiveData<EntryState> = stateMutable

    init {
        entryUseCase(Unit) {
            it.either({

            }, {

            })
        }
    }
}