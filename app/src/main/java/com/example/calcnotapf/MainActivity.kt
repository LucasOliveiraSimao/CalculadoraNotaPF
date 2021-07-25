package com.example.calcnotapf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var nota = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener { addNumbers(btnOne.text.toString()) }
        btnTwo.setOnClickListener { addNumbers(btnTwo.text.toString()) }
        btnThree.setOnClickListener { addNumbers(btnThree.text.toString()) }
        btnFour.setOnClickListener { addNumbers(btnFour.text.toString()) }
        btnFive.setOnClickListener { addNumbers(btnFive.text.toString()) }
        btnSix.setOnClickListener { addNumbers(btnSix.text.toString()) }
        btnSeven.setOnClickListener { addNumbers(btnSeven.text.toString()) }
        btnEigth.setOnClickListener { addNumbers(btnEigth.text.toString()) }
        btnNine.setOnClickListener { addNumbers(btnNine.text.toString()) }
        btnZero.setOnClickListener { addNumbers(btnZero.text.toString()) }

    }

    private fun addNumbers(n: String) {
        nota = txtResult.text.toString() + n
        txtResult.text = nota
    }

}