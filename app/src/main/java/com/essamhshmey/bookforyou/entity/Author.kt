package com.essamhshmey.bookforyou.entity

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Author(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "name") var name:String,
    @ColumnInfo(name = "books") var books:List<Book>,
    @ColumnInfo(name = "description") val description:String,
    @ColumnInfo(name = "noorbookLink") val noorbookLink:String
    )
