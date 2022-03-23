package com.example.exam1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ViewAdapterGrid(val context : Context,val visibility : Boolean,val Products : ProductListHolder
                   ,val element : Int,var costAdapt : (cost : String,) -> Unit
                    ,var itemClick : (position : Int,elementList : Int)->Unit) : RecyclerView.Adapter<ViewHolderGrid>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderGrid {
        val v  = LayoutInflater.from(context).inflate(R.layout.recyclerview_grid_layout,parent,false)
        return ViewHolderGrid(v,visibility,element,costAdapt,itemClick)

    }
    override fun onBindViewHolder(holder: ViewHolderGrid, position: Int) {
        holder.bindData(Products.getName(position)!!,Products.getBrand(position)!!,Products.getCost(position)!!,Products.getImage(position)!!)
    }

    override fun getItemCount(): Int {
        return Products.getSize()//hashList.size
    }

}