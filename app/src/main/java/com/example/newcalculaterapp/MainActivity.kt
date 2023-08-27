package com.example.newcalculaterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var button1 : Button? = null
    private var button2 : Button? = null
    private var button3 : Button? = null
    private var button4 : Button? = null
    private var button5 : Button? = null
    private var button6 : Button? = null
    private var button7 : Button? = null
    private var button8: Button? = null
    private var button9 : Button? = null
    private var buttonAC : Button? = null

    private var buttonPlus: Button? = null
    private var buttonMinus: Button? = null
    private var buttonMultiply: Button? = null
    private var buttonDivide: Button? = null
    private var buttonEqual: Button? = null
    private var buttonPercent: Button? = null

    private var text_view : TextView? = null

    private var isNumber1: Boolean = true
    private var number1: String = ""
    private var number2: String = ""
    private var total: String = ""
    private var currentOperation: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        val textViewFragment = TextView()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_buttons, textViewFragment)
            commit()
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button_one)
        button2 = findViewById(R.id.button_2)
        button3 = findViewById(R.id.button_three)
        button4 = findViewById(R.id.button_four)
        button5 = findViewById(R.id.button_five)
        button6 = findViewById(R.id.button_six)
        button7 = findViewById(R.id.button_seven)
        button8 = findViewById(R.id.button_eight)
        button9 = findViewById(R.id.button_nine)
        text_view = findViewById(R.id.text_view)
        buttonPlus = findViewById(R.id.button_plus)
        buttonMinus = findViewById(R.id.button_minus)
        buttonMultiply = findViewById(R.id.button_multiply)
        buttonDivide = findViewById(R.id.button_divide)
        buttonEqual = findViewById(R.id.button_equal)
        buttonPercent = findViewById(R.id.button_percent)
        button1!!.setOnClickListener{
            if (isNumber1) {
                number1 += "1"
                text_view!!.text = number1
            } else {
                number2 += "1"
                text_view!!.text = number2
            }
        }
        button2!!.setOnClickListener{
            if (isNumber1) {
                number1 += "2"
                text_view!!.text = number1
            } else {
                number2 += "2"
                text_view!!.text = number2
            }
        }
        button3!!.setOnClickListener{
            if (isNumber1) {
                number1 += "3"
                text_view!!.text = number1
            } else {
                number2 += "3"
                text_view!!.text = number2
            }
        }
        button4!!.setOnClickListener{
            if (isNumber1) {
                number1 += "4"
                text_view!!.text = number1
            } else {
                number2 += "4"
                text_view!!.text = number2
            }
        }
        button5!!.setOnClickListener{
            if (isNumber1) {
                number1 += "5"
                text_view!!.text = number1
            } else {
                number2 += "5"
                text_view!!.text = number2
            }
        }
        button6!!.setOnClickListener{
            if (isNumber1) {
                number1 += "6"
                text_view!!.text = number1
            } else {
                number2 += "6"
                text_view!!.text = number2
            }
        }
        button7!!.setOnClickListener{
            if (isNumber1) {
                number1 += "7"
                text_view!!.text = number1
            } else {
                number2 += "7"
                text_view!!.text = number2
            }
        }
        button8!!.setOnClickListener{
            if (isNumber1) {
                number1 += "8"
                text_view!!.text = number1
            } else {
                number2 += "8"
                text_view!!.text = number2
            }
        }
        button9!!.setOnClickListener{
            if (isNumber1) {
                number1 += "9"
                text_view!!.text = number1
            } else {
                number2 += "9"
                text_view!!.text = number2
            }
        }

        buttonPlus!!.setOnClickListener {
            isNumber1 = false
            currentOperation = "plus"
        }

        buttonMinus!!.setOnClickListener {
            isNumber1 = false
            currentOperation = "minus"
        }

        buttonMultiply!!.setOnClickListener {
            isNumber1 = false
            currentOperation = "multiply"
        }

        buttonDivide!!.setOnClickListener {
            isNumber1 = false
            currentOperation = "divide"
        }

        buttonPercent!!.setOnClickListener {
            isNumber1 = true
            currentOperation = "percent"
        }
        buttonAC!!.setOnClickListener {
            currentOperation = "AC"
        }



        buttonEqual!!.setOnClickListener {

            when (currentOperation) {
                "plus" -> {
                    val total = number1.toInt() + number2.toInt()
                    text_view!!.text = total.toString()
                }
                "minus" -> {
                    val total = number1.toInt() - number2.toInt()
                    text_view!!.text = total.toString()
                }
                "multiply" -> {
                    val total = number1.toInt() * number2.toInt()
                    text_view!!.text = total.toString()
                }
                "divide" -> {
                    val total = number1.toInt() / number2.toInt()
                    text_view!!.text = total.toString()
                }
                "percent" -> {
                    val total = number1.toInt() / 100
                    text_view!!.text = total.toString()
                }

            }

        }

    }
}