package com.example.myproject29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class CheckboxRadioActivity : AppCompatActivity() {
    var cbAgree : CheckBox?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio)
        cbAgree = findViewById(R.id.cbAgree)
        cbAgree?.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Checked", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Not Checked", Toast.LENGTH_LONG).show()
            }
        }
    }

}