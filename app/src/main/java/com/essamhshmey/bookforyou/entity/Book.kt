package com.essamhshmey.bookforyou.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_table")
data class Book(
   @PrimaryKey(autoGenerate = true) val uid: Int,
   @ColumnInfo(name = "book_name") val bookName:String,
   @ColumnInfo(name = "book_link") val bookLink:String,
   @ColumnInfo(name = "book_author") val author:String,
   @ColumnInfo(name = "book_section") val section:String,
   @ColumnInfo(name = "book_languages") val languages:List<String>,
   @ColumnInfo(name = "book_pageCounter") val pageCounter:Int,
   @ColumnInfo(name = "book_fileType") val fileType:String,
   @ColumnInfo(name = "book_fileSize") val fileSize:String,
   @ColumnInfo(name = "book_dateCreated") val dateCreated:String,
   @ColumnInfo(name = "book_description") val description:String,
   @ColumnInfo(name = "book_quotes") val quotes:List<String>,
   @ColumnInfo(name = "book_photoLink") val  photoLink:String,
   @ColumnInfo(name = "book_noorbookLink") val noorbookLink:String
){

}
