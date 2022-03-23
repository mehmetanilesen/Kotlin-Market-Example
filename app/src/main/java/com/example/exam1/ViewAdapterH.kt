package com.example.exam1

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



class ViewAdapterH (val context : Context,val productList : ArrayList<String>, var itemClick : (position : Int)->Unit) : RecyclerView.Adapter<ViewHolderH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderH {
        val v  = LayoutInflater.from(context).inflate(R.layout.recyclerview_h_layout,parent,false)
        return ViewHolderH(context,v,itemClick)
    }
    override fun onBindViewHolder(holder: ViewHolderH, position: Int) {
        holder.bindData(productList[position])
    }

    override fun getItemCount(): Int {
        return productList.size
    }

}