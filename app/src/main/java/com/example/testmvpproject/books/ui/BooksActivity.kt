package com.example.testmvpproject.books.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testmvpproject.R
import com.example.testmvpproject.books.adapters.RecyclerAdapter
import com.example.testmvpproject.books.data.Book
import com.example.testmvpproject.books.data.BookRepository
import com.example.testmvpproject.books.p.UserP
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity(), IUserView {

    private val userP: UserP by lazy {
        UserP(this, BookRepository)
    }

    private val adapter: RecyclerAdapter by lazy {
        RecyclerAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter

        userP.loadData()

    }

    override fun showBooks(list: MutableList<Book>) {
        adapter.list = list
        adapter.notifyDataSetChanged()
    }
}