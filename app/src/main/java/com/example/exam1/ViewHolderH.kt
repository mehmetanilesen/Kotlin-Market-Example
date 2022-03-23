package com.example.exam1

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

val VList : ArrayList<Button> = arrayListOf()

class ViewHolderH(val context : Context,itemView : View,var itemClick : (position : Int) -> Unit) : RecyclerView.ViewHolder(itemView) {

    var categoryButton : Button

    init {
        categoryButton = itemView.findViewById(R.id.categoryButton)
        VList.add(categoryButton)

        VList[0].setBackgroundColor(Color.parseColor("#9DD71C"))
        VList[0].setTextColor(Color.WHITE)
        categoryButton.setOnClickListener {
            for (item in 0 until VList.size){
                println("item : $item position : $adapterPosition")
                if(item == adapterPosition){
                    println("OK")
                    VList[item].setBackgroundColor(Color.parseColor("#9DD71C"))
                    VList[item].setTextColor(Color.WHITE)
                }else{
                    VList[item].setBackgroundColor(Color.TRANSPARENT)
                    VList[item].setTextColor(Color.parseColor("#9C9C9C"))
                }
            }
            itemClick(adapterPosition)
        }
    }

    fun bindData(categoryName : String){
        categoryButton.text= categoryName
    }

}