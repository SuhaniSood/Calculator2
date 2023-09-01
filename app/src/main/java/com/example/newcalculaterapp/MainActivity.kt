package com.example.newcalculaterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFragement = Calculator()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_calculator, buttonFragement)
            commit()
        }

    }
}