package com.example.exam1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exam1.databinding.ActivityProductDetailBinding
import kotlin.properties.Delegates

class Activity_Product_Detail : AppCompatActivity() {
    lateinit var binding : ActivityProductDetailBinding

    var session by Delegates.notNull<Boolean>()

    var globcost : Float? = 00.00f
    var product : ArrayList<Any> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        activityIntentCatcher()


        binding.buttonaddDetail.setOnClickListener {
            globcost =
                globcost?.plus(product[3].toString().toFloat())
            binding.productTopBar2.TextViewTotalCost.setText("$$globcost")
        }

        binding.productTopBar2.backbuttonTopBar.setOnClickListener {
            val x_intent = Intent(this,Activity_Product_List::class.java)
            x_intent.putExtra("globcost",globcost)
            x_intent.putExtra("session",session)
            VList.clear()
            finish()
            startActivity(x_intent)
        }
    }

    fun activityIntentCatcher(){
        session = intent.getBooleanExtra("session",false)
        intent.getStringExtra("name")?.let { product.add(it) }
        intent.getStringExtra("brand")?.let { product.add(it) }
        intent.getStringExtra("expression")?.let { product.add(it) }
        product.add(intent.getFloatExtra("cost",00.0f))
        globcost = intent.getFloatExtra("globcost",00.0f)

        databinder()
        visibilityRegulator(session)
    }
    fun visibilityRegulator(visibility : Boolean){
        if(!visibility){
            binding.productTopBar2.basketImageView.visibility = View.GONE
            binding.productTopBar2.TextViewTotalCost.visibility = View.GONE
            binding.buttonaddDetail.visibility = View.GONE
        }
    }
    fun databinder(){
        binding.textViewdetailProductName.text = product[0].toString()
        binding.textViewdetailBrand.text = product[1].toString()
        binding.textViewDetailExpression.text = product[2].toString()
        binding.textViewdetailCost.text = "$${product[3]}"
        binding.productTopBar2.TextViewTotalCost.text = "$$globcost"
    }
}


