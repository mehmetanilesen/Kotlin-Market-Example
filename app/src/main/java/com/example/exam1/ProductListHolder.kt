package com.example.exam1

import android.graphics.drawable.Drawable

class ProductListHolder() {

    var ListProduct : ArrayList<ProductHolder> = arrayListOf()

    fun addProduct(product: ProductHolder) {
        ListProduct.add(product)
    }
    fun getName(position : Int) : String?{
        return ListProduct.get(position).ProductName
    }
    fun getBrand(position: Int) : String?{
        return ListProduct.get(position).BrandName
    }
    fun getCost(position: Int) : Float?{
        return ListProduct.get(position).Cost
    }
    fun getCategory(position: Int) : String?{
        return ListProduct.get(position).ProductCategory
    }
    fun getExpression(position: Int) : String?{
        return ListProduct.get(position).Expression
    }
    fun getImage(position: Int) : Drawable?{
        return ListProduct.get(position).ProductImg
    }
    fun getSize() : Int{
        return ListProduct.size
    }

}
