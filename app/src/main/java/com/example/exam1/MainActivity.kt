package com.example.exam1

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.exam1.databinding.EnteranceLayoutBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : EnteranceLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = EnteranceLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val window: Window = this@MainActivity.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@MainActivity,R.color.topnavbarBlue)

        getWindow().setSoftInputMode(
            WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );

        binding.enterButton.setOnClickListener {
            val check = EnteranceControl(binding.editTextPhoneNo
                ,binding.passwordInputEditText
                ,::errorToastMaker)
            if(check.enteranceCheck()){
                activityChanger(true)
            }
        }
        binding.withoutmemberButton.setOnClickListener {
            activityChanger(false)
        }
    }
    fun errorToastMaker(error : String){
        Toast.makeText(this,error,Toast.LENGTH_SHORT).show()
    }
    fun activityChanger(sessionControl : Boolean){
        val x_intent  = Intent(this,Activity_Product_List::class.java)
        x_intent.putExtra("session",sessionControl)
        finish()
        startActivity(x_intent)
    }

}