package com.example.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

//UUID - уникальный идентификатор,задаём рандомом
//Date() - текущая дата по умолчанию
@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
                 var title: String = "", var date: Date = Date(),
                 var isSolved: Boolean = false) {
}