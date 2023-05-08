package com.essamhshmey.question.model.local

import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.essamhshmey.bookforyou.entity.Book


@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addbook(vararg  person: Book)
    @Query("SELECT * FROM book_table")
    fun getAll(): List<Book>
    @Query("SELECT * FROM book_table WHERE book_name = :name")
    fun getbookName(name:String):Book
    @Query("SELECT * FROM book_table WHERE book_author = :book_author")
    fun getauthor(book_author:String):MutableLiveData<Book>
    @Query("SELECT * FROM book_table WHERE book_section = :section")
    fun getsection(section:String):MutableLiveData<Book>

}