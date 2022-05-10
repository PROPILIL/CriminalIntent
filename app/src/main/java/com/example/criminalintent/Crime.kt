package com.example.criminalintent

import java.util.*

//UUID - уникальный идентификатор,задаём рандомом
//Date() - текущая дата по умолчанию

data class Crime(val id: UUID = UUID.randomUUID(),
    var title: String = "", var date: Date = Date(),
    var isSolved: Boolean = false) {
}