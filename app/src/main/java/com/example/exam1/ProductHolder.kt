package com.example.exam1

import android.graphics.drawable.Drawable

open class ProductHolder(category : String? = null,name : String? = null,brand : String? = null
                         ,cost: Float? = null,expression : String?,image : Drawable? = null) {

    val ProductCategory : String?
    val ProductName : String?
    val BrandName : String?
    val Cost : Float?
    val Expression : String?
    val ProductImg : Drawable?

    init {
        ProductCategory = category
        ProductName = name
        BrandName = brand
        Cost = cost
        Expression = expression
        ProductImg = image
    }
}