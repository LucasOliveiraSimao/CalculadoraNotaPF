package com.example.calcnotapf

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.abs


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
        btnPoint.setOnClickListener { addNumbers(btnPoint.text.toString()) }

        btnErase.setOnClickListener { erase() }
        btnAllErase.setOnClickListener { allErase() }

        btnEquals.setOnClickListener { checks() }

    }

    private fun convert(): Double {
        return (txtResult.text.toString().toDouble())
    }

    private fun calculate(): Double {
        return abs(15 - (convert() * 2))

    }

    private fun checks() {
        when {
            convert() in 8.0..10.0 -> {
                message(R.string.msg_parabens, R.string.msg_1, R.drawable.ic_aprovado_32)
            }
            convert() in 7.5..7.99 -> {
                message(R.string.msg_alerta, R.string.msg_2, R.drawable.ic_alerta_32)
            }
            convert() in 2.5..7.49 -> {
                message(
                    R.string.msg_aviso,
                    "Você precisa de " + calculate() + " ponto(s) para ser aprovado",
                    R.drawable.ic_aviso_32
                )
            }
            else -> {
                message(R.string.msg_reprovado, R.string.msg_3, R.drawable.ic_reprovado_32)
            }
        }
    }

    private fun message(title: Int, msg: Int, icon: Int) {
        val alert = AlertDialog.Builder(this)
        alert.setTitle(title)
        alert.setIcon(icon)
        alert.setMessage(msg)
        alert.setPositiveButton("Fechar", null)
        alert.create().show()
    }

    private fun message(title: Int, msg: String, icon: Int) {
        val alert = AlertDialog.Builder(this)
        alert.setTitle(title)
        alert.setIcon(icon)
        alert.setMessage(msg)
        alert.setPositiveButton("Fechar", null)
        alert.create().show()
    }

    private fun addNumbers(n: String) {
        nota = txtResult.text.toString() + n
        txtResult.text = nota
    }

    private fun erase() {
        if (txtResult.text.toString().isNotEmpty()) {
            nota = txtResult.text.toString()
            nota = nota.substring(0, nota.length - 1)
            txtResult.text = nota
        }
    }

    private fun allErase() {
        txtResult.text = ""
        txtResult.hint = "ME"
    }

}