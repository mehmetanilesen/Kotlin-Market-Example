package com.example.exam1

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView


class ViewHolderGrid(itemView : View,val visibility : Boolean,val element : Int,var costAdapt : (cost : String,) -> Unit ,var itemClick : (position : Int,element : Int) -> Unit) : RecyclerView.ViewHolder(itemView) {

     var productName : TextView
     var brand : TextView
     var cost : TextView
     var productClick : AppCompatButton
     var addButton: AppCompatButton

    init {
        productName = itemView.findViewById(R.id.TextViewProdcutName)
        brand = itemView.findViewById(R.id.TextViewBrand)
        cost = itemView.findViewById(R.id.TextViewCost)
        addButton = itemView.findViewById(R.id.addProdcutButtonGrid)

        if(!visibility){
            addButton.visibility = View.INVISIBLE
        }else{
            addButton.setOnClickListener {
                costAdapt(cost.text as String)
            }
        }
        productClick= itemView.findViewById(R.id.productClickButton)
        productClick.setOnClickListener {
            itemClick(adapterPosition,element)
        }
    }

    fun bindData(name : String, brandname : String, costFloat : Float,img : Drawable){
        productName.text= name
        brand.text = brandname
        cost.text = "$${costFloat.toString()}"
        productClick.setBackgroundDrawable(img)

    }

}