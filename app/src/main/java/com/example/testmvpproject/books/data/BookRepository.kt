package com.example.testmvpproject.books.data

object BookRepository: IBookRepository {

    override fun loadData(): MutableList<Book> =
        mutableListOf<Book>().apply {
            add(Book("哈哈哈", 21.0))
            add(Book("高规格", 21.0))
            add(Book("啥啥啥", 21.0))
            add(Book("休闲鞋", 21.0))
            add(Book("钱钱钱", 21.0))
        }
}