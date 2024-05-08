package com.jmtgroup.pills.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmtgroup.pills.domain.AddPillsUseCase
import com.jmtgroup.pills.domain.DeletePillsUseCase
import com.jmtgroup.pills.domain.GetAllPillsUseCase
import com.jmtgroup.pills.domain.models.PillsModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PillsViewModel @Inject constructor(
    private val addPillsUseCase: AddPillsUseCase,
    private val getAllPillsUseCase: GetAllPillsUseCase,
    private val deletePillsUseCase: DeletePillsUseCase
): ViewModel() {

    fun addPills(pills: PillsModel) {
        viewModelScope.launch {

        }
    }

    fun getAllPills() {
        viewModelScope.launch {
            getAllPillsUseCase.getAllPills()
        }
    }

    fun deletePills(pills: PillsModel) {
        viewModelScope.launch {

        }
    }
}