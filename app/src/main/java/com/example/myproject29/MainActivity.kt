package com.example.myproject29

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etName: EditText? = null
    var etCollegeInfo: EditText? = null
    var etPhoneNum: EditText? = null
    var btnValidate: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        etCollegeInfo = findViewById(R.id.etCollegeInfo)
        etPhoneNum = findViewById(R.id.etPhoneNum)
        btnValidate = findViewById(R.id.btnValidate)

        btnValidate?.setOnClickListener{
            if(etName?.text.isNullOrEmpty())
            {
            etName?.error="Enter your name"
            }
            else if(etCollegeInfo?.text.isNullOrEmpty())
            {
                etCollegeInfo?.error="Enter about college"
            }
            if(etPhoneNum?.text.toString().length < 10)
            {
                etPhoneNum?.error="Enter a VAlid Phone Number"
            }
            else
            {
                Toast.makeText(this, "Valid details", Toast.LENGTH_SHORT).show()
                var intent = Intent(this, CheckboxRadioActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}