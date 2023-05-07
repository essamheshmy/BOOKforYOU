package com.essamhshmey.bookforyou.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_table")
data class Book(
   @PrimaryKey(autoGenerate = true) val uid: Int,
   @ColumnInfo(name = "book_name") val bookName:String,
   @ColumnInfo(name = "author") val author:String,
   @ColumnInfo(name = "section") val section:String,
   @ColumnInfo(name = "languages") val languages:List<String>,
   @ColumnInfo(name = "pageCounter") val pageCounter:Int,
   @ColumnInfo(name = "fileType") val fileType:String,
   @ColumnInfo(name = "fileSize") val fileSize:String,
   @ColumnInfo(name = "dateCreated") val dateCreated:String,
   @ColumnInfo(name = "description") val description:String,
   @ColumnInfo(name = "quotes") val quotes:List<String>,
   @ColumnInfo(name = "photoLink") val  photoLink:String,
   @ColumnInfo(name = "noorbookLink") val noorbookLink:String
){

}
