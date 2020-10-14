package com.example.testmvpproject.books.p

import com.example.testmvpproject.books.data.IBookRepository
import com.example.testmvpproject.books.ui.IUserView

class UserP(private val userView: IUserView, private val bookRepository: IBookRepository) {

    fun loadData() {
        userView.showBooks(bookRepository.loadData())
    }

}