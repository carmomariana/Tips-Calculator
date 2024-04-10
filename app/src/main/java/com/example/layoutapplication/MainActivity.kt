package com.example.layoutapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.layoutapplication.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity () {

    // Valor total conta
    // Numero de pessoas
    // Porcentagem da gorjeta
        // 10%, 15% ou 20%
    // Calcular
    // Limpar

    //Recuperar os views do layout
    //Find view by id
    //ViewBinding
    //Recuperar os Radios buttons

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var percentage: Int = 0
        binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                percentage = 10
            }
        }

        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                percentage = 15
            }
        }

        binding.rbOptionThree.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                percentage = 20
            }
        }

        binding.btnClean.setOnClickListener {
            println("Mariana1" + binding.tieTotal.text)
            println("Mariana2" + binding.tieNumPeople.text)
        }
        binding.btnDone.setOnClickListener {
            val totalTable: Float = binding.tieTotal.text.toString().toFloat()
            val nPeople: Int = binding.tieNumPeople.text.toString().toInt()

            val totalTemp = totalTable / nPeople
            val tips = totalTemp * percentage / 100
            val totalWithTips = totalTemp + tips
            binding.tvResult.text = "Total with tips: $totalWithTips"
        }

        binding.btnClean.setOnClickListener {
            binding.tvResult.text = ""
        }
    }
}
