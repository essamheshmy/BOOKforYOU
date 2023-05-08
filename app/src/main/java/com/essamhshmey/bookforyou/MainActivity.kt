package com.essamhshmey.bookforyou

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.room.Room
import com.essamhshmey.question.model.local.BookDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
        val db = Room.databaseBuilder(
            applicationContext,
            BookDatabase::class.java, "book_database"
        ).build()
    }
}