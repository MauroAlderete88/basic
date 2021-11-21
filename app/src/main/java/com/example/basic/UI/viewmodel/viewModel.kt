package com.example.basic.UI.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.basic.domain.interactor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class viewModel @Inject constructor(
     var interactor: interactor
) : ViewModel() {

    val club = MutableLiveData<String>()

     fun solicitarClub (){
         viewModelScope.launch(Dispatchers.IO) {
             club.postValue( interactor.prueba())
         }

    }

}