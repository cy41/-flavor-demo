package com.example.testmvpproject.books.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testmvpproject.R
import com.example.testmvpproject.books.data.Book
import kotlinx.android.synthetic.main.item_book.view.*

class RecyclerAdapter(val context: Context): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var list: MutableList<Book> = mutableListOf()


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(data: Book) {
            itemView.apply {
                book_name.text = data.name.toString()
                book_money.text = data.money.toString()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_book, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }
}