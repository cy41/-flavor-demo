package com.example.testmvpproject.books.ui

import com.example.testmvpproject.books.data.Book

interface IUserView {

    fun showBooks(list: MutableList<Book>)
}