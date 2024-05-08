package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import models.BlockPost

class BlogRecyclerAdapter(val itemData: Array<BlockPost>) : RecyclerView.Adapter<BlogRecyclerAdapter.ViewHolderClass>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.item_blog, parent, false )
        return ViewHolderClass(itemView)

    }


    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {

    }


    override fun getItemCount(): Int {
        return itemData.size
    }


    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView){
        

    }

}