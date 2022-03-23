package com.example.exam1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam1.databinding.ActivityProductListBinding
import kotlin.properties.Delegates


class Activity_Product_List : AppCompatActivity() {
    lateinit var binding : ActivityProductListBinding

    lateinit var Products1 : ProductListHolder
    lateinit var Products2 : ProductListHolder
    lateinit var Products3 : ProductListHolder
    lateinit var Products4 : ProductListHolder

    lateinit var ListProductHolder : ArrayList<ProductListHolder>

    lateinit var categoryList : ArrayList<String>


    var element : Int = 0
    var globcost : Float? = 00.00f
    var session by Delegates.notNull<Boolean>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        activityIntentCatcher()

        Products1 = ProductListHolder()
        Products2 = ProductListHolder()
        Products3 = ProductListHolder()
        Products4 = ProductListHolder()

        categoryList = arrayListOf()
        ListProductHolder = arrayListOf()

        categoryList.add("CAT 1")
        categoryList.add("CAT 2")
        categoryList.add("CAT 3")
        categoryList.add("CAT 4")

        val product1 = ProductHolder("CAT 1","PRODUCT 1a.0","BRAND 1",11.00f,"Expression 1.a0",resources.getDrawable(R.drawable.img, theme))
        val product2 = ProductHolder("CAT 1","PRODUCT 2b.0","BRAND 2",12.00f,"Expression 2.b0",resources.getDrawable(R.drawable.img2, theme))
        val product3 = ProductHolder("CAT 1","PRODUCT 3c.0","BRAND 3",13.00f,"Expression 3.c0",resources.getDrawable(R.drawable.img, theme))
        val product4 = ProductHolder("CAT 1","PRODUCT 4d.0","BRAND 4",14.00f,"Expression 4.d0",resources.getDrawable(R.drawable.img2, theme))
        val product5 = ProductHolder("CAT 1","PRODUCT 5e.0","BRAND 5",15.00f,"Expression 5.e0",resources.getDrawable(R.drawable.img, theme))
        val product6 = ProductHolder("CAT 1","PRODUCT 6f.0","BRAND 6",16.00f,"Expression 6.f0",resources.getDrawable(R.drawable.img, theme))

        val product7 = ProductHolder("CAT 2","PRODUCT 1a.1","BRAND 1",16.00f,"Expression 1.a1",resources.getDrawable(R.drawable.img2, theme))
        val product8 = ProductHolder("CAT 2","PRODUCT 2b.1","BRAND 2",17.00f,"Expression 2.b1",resources.getDrawable(R.drawable.img, theme))
        val product9 = ProductHolder("CAT 2","PRODUCT 3c.1","BRAND 3",18.00f,"Expression 3.c1",resources.getDrawable(R.drawable.img2, theme))
        val product10 = ProductHolder("CAT 2","PRODUCT 4d.1","BRAND 4",19.00f,"Expression 4.d1",resources.getDrawable(R.drawable.img, theme))
        val product11 = ProductHolder("CAT 2","PRODUCT 5e.1","BRAND 5",20.00f,"Expression 5.e1",resources.getDrawable(R.drawable.img2, theme))
        val product12 = ProductHolder("CAT 2","PRODUCT 6f.1","BRAND 6",21.00f,"Expression 6.f1",resources.getDrawable(R.drawable.img, theme))

        val product13 = ProductHolder("CAT 3","PRODUCT 1a.2","BRAND 1",22.00f,"Expression 1.a2",resources.getDrawable(R.drawable.img, theme))
        val product14 = ProductHolder("CAT 3","PRODUCT 2b.2","BRAND 2",23.00f,"Expression 2.b2",resources.getDrawable(R.drawable.img, theme))
        val product15 = ProductHolder("CAT 3","PRODUCT 3c.2","BRAND 3",24.00f,"Expression 3.c2",resources.getDrawable(R.drawable.img2, theme))
        val product16 = ProductHolder("CAT 3","PRODUCT 4d.2","BRAND 4",25.00f,"Expression 4.d2",resources.getDrawable(R.drawable.img2, theme))
        val product17 = ProductHolder("CAT 3","PRODUCT 5e.2","BRAND 5",26.00f,"Expression 5.e2",resources.getDrawable(R.drawable.img, theme))
        val product18 = ProductHolder("CAT 3","PRODUCT 6f.2","BRAND 6",27.00f,"Expression 6.f2",resources.getDrawable(R.drawable.img, theme))

        val product19 = ProductHolder("CAT 4","PRODUCT 1a.3","BRAND 1",28.00f,"Expression 1.a3",resources.getDrawable(R.drawable.img2, theme))
        val product20 = ProductHolder("CAT 4","PRODUCT 2b.3","BRAND 2",29.00f,"Expression 2.b3",resources.getDrawable(R.drawable.img2, theme))
        val product21 = ProductHolder("CAT 4","PRODUCT 3c.3","BRAND 3",30.00f,"Expression 3.c3",resources.getDrawable(R.drawable.img, theme))
        val product22 = ProductHolder("CAT 4","PRODUCT 4d.3","BRAND 4",31.00f,"Expression 4.d3",resources.getDrawable(R.drawable.img2, theme))
        val product23 = ProductHolder("CAT 4","PRODUCT 5e.3","BRAND 5",32.00f,"Expression 5.e3",resources.getDrawable(R.drawable.img, theme))
        val product24 = ProductHolder("CAT 4","PRODUCT 6f.3","BRAND 6",33.00f,"Expression 6.f3",resources.getDrawable(R.drawable.img, theme))

        Products1.addProduct(product1)
        Products1.addProduct(product2)
        Products1.addProduct(product3)
        Products1.addProduct(product4)
        Products1.addProduct(product5)
        Products1.addProduct(product6)


        Products2.addProduct(product7)
        Products2.addProduct(product8)
        Products2.addProduct(product9)
        Products2.addProduct(product10)
        Products2.addProduct(product11)
        Products2.addProduct(product12)

        Products3.addProduct(product13)
        Products3.addProduct(product14)
        Products3.addProduct(product15)
        Products3.addProduct(product16)
        Products3.addProduct(product17)
        Products3.addProduct(product18)

        Products4.addProduct(product19)
        Products4.addProduct(product20)
        Products4.addProduct(product21)
        Products4.addProduct(product22)
        Products4.addProduct(product23)
        Products4.addProduct(product24)

        ListProductHolder.add(Products1)
        ListProductHolder.add(Products2)
        ListProductHolder.add(Products3)
        ListProductHolder.add(Products4)




        binding.recyclerViewProdcutHMenu.adapter = ViewAdapterH(this,categoryList,::itemclickH)

        val linearlayoutmanager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerViewProdcutHMenu.layoutManager = linearlayoutmanager

        val gridlayoutmannager = GridLayoutManager(
            this,
            4,
            RecyclerView.VERTICAL,
            false)
        binding.recyclerViewProductGridMenu.layoutManager = gridlayoutmannager
        binding.recyclerViewProductGridMenu.adapter = ViewAdapterGrid(this,session,ListProductHolder[element],element,::costAdapt,::itemclickV)

        binding.recyclerViewProdcutHMenu.adapter!!.notifyDataSetChanged()
        binding.recyclerViewProductGridMenu.adapter!!.notifyDataSetChanged()

        binding.productTopBar.backbuttonTopBar.setOnClickListener {
            val x_intent  = Intent(this,MainActivity::class.java)
            VList.clear()
            finish()
            startActivity(x_intent)
        }
    }

    fun itemclickV(position: Int,element : Int){
        val x_intent = Intent(this,Activity_Product_Detail::class.java)
        x_intent.putExtra("name",ListProductHolder[element].getName(position))
        x_intent.putExtra("brand",ListProductHolder[element].getBrand(position))
        x_intent.putExtra("cost",ListProductHolder[element].getCost(position))
        x_intent.putExtra("expression",ListProductHolder[element].getExpression(position))
        x_intent.putExtra("session",session)
        x_intent.putExtra("globcost",globcost)
        startActivity(x_intent)
    }
    fun itemclickH(position : Int){
        element = position
        binding.recyclerViewProductGridMenu.adapter = ViewAdapterGrid(this,session,ListProductHolder[element],element,::costAdapt,::itemclickV)
    }
    fun activityIntentCatcher(){
        session = intent.getBooleanExtra("session",false)
        globcost = intent.getFloatExtra("globcost",00.00f)
        databinderCost()
        visibilityRegulator(session)
    }
    fun visibilityRegulator(visibility : Boolean){
        if(!visibility){
            binding.productTopBar.TextViewTotalCost.visibility = View.GONE
            binding.productTopBar.basketImageView.visibility = View.GONE
        }
    }
    fun costAdapt (cost : String){
        val txt = findViewById<TextView>(R.id.TextViewTotalCost)
        val costn = cost.drop(1)
        globcost = globcost?.plus(costn.toFloat())
        println("--> glob : $globcost costn :${costn.toFloat()}")
        txt.text = "$${globcost}"
    }
    fun databinderCost(){
        binding.productTopBar.TextViewTotalCost.text ="$${String.format("%.2f",globcost)}"
    }
}