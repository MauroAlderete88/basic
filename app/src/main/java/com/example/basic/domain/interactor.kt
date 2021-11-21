package com.example.basic.domain

import com.example.basic.data.model.clubesProvider
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject

class interactor @Inject constructor(
    val clubesProvider: clubesProvider
) {
     fun prueba () : String {
        return clubesProvider.ramdon()
    }
}