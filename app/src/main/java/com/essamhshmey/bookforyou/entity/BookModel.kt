package com.essamhshmey.bookforyou.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "book_table")
data class BookModel(
  // @PrimaryKey val uid: Int,
   @ColumnInfo(name = "book_name")
   val name:String?,
   @ColumnInfo(name = "person_age")
   val age:String?
)
