package com.example.exam1

import android.content.Context
import android.widget.TextView
import java.util.regex.Pattern

class EnteranceControl(PhoneView : TextView, PasswordView : TextView,val  errorSupplier : (errorStr : String) -> Unit) {

    private val validPhone: String = "01111111111"
    private val validPassword: String = "#e&it1m"

    val PhoneView: TextView
    val PasswordView: TextView

    init {
        this.PhoneView = PhoneView.findViewById(R.id.editTextPhoneNo)
        this.PasswordView = PasswordView.findViewById(R.id.passwordInputEditText)
    }

    fun passwordValidation(password: String): Boolean {
        val passwordREGEX = Pattern.compile(
            "^" +
                    "(?=.*[0-9])" +         //at least 1 digit
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{7,}" +               //at least 7 characters
                    "$"
        );
        return passwordREGEX.matcher(password).matches()
    }

    fun enteranceCheck(): Boolean {
        val phoneNo = PhoneView.text.toString()
        val password = PasswordView.text.toString()

        return if (phoneNo == validPhone) {
            if (password == validPassword) {
                true
            } else if(passwordValidation(password)){
                errorSupplier("Wrong Password")
                false
            }else {
                errorSupplier("Password is not valid")
                false
            }
        } else {
            errorSupplier("Phone Number or Password are wrong")
            false
        }
    }
}
