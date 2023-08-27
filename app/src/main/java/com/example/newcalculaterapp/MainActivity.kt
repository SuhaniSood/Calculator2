package com.example.newcalculaterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewFragment = TextView()
        val buttonFragement = Buttons()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_text_view, textViewFragment)
            commit()
        }

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_buttons, buttonFragement)
            commit()
        }

    }
}