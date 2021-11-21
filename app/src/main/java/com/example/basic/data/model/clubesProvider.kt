package com.example.basic.data.model

import javax.inject.Inject

class clubesProvider @Inject constructor() {

    lateinit var liga : List<clubes>

    init {
        liga = listOf(
            clubes("River Plate"),
            clubes("Racing Club"),
            clubes("Independiente"),
            clubes("San lorenzo"),
            clubes("Aldosivi"),
            clubes("Defensa y Justicia"),
            clubes("Lanus"),
            clubes("Estudiantes"),
            clubes("Velez"),
            clubes("Crucero del norte"),
            clubes("Talleres")
        )
    }

    /**
     * Retorna un valor aleatorio de liga
     */
     fun ramdon () : String {
        var nombre = liga.random().nombre
        return nombre
    }

}