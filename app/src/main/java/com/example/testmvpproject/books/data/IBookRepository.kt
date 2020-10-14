package com.example.testmvpproject.books.data

interface IBookRepository {
    fun loadData(): MutableList<Book>
}