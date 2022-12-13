package com.example.mobile1

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile1.databinding.ItemBinding
import com.google.android.material.snackbar.Snackbar

class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    private var myList = emptyList<MyModel>()

    inner class ViewHolder(val binding: ItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.cardTitle.text = myList[position].name
        holder.binding.cardSubtext.text = myList[position].years
        holder.binding.cardText.text = myList[position].desc
        holder.binding.cardSex.text = myList[position].sex
        holder.binding.cardImg.setImageResource(myList[position].image)


        holder.binding.container.setOnClickListener {
            val snackbar = Snackbar.make(it, "Нажата карточка: " + myList[position].name, Snackbar.LENGTH_LONG).setAction("Action", null)
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView = snackbar.view
            snackbarView.setBackgroundColor(Color.BLACK)
            snackbar.show()
        }

        holder.binding.cardThumbUp.setOnClickListener {
            val snackbar = Snackbar.make(it, "Нажат лайк: " + myList[position].name, Snackbar.LENGTH_LONG).setAction("Action", null)
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView = snackbar.view
            snackbarView.setBackgroundColor(Color.BLACK)
            snackbar.show()
        }
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList (list: List<MyModel>) {
        myList = list
        notifyDataSetChanged()
    }

    fun getList(): List<MyModel> {
        return myList
    }
}