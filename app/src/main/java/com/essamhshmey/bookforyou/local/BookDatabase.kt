package com.essamhshmey.question.model.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.essamhshmey.bookforyou.entity.Book


@Database(entities = [Book::class], version =1)
abstract class BookDatabase: RoomDatabase(){
    abstract fun bookDao():BookDao

}