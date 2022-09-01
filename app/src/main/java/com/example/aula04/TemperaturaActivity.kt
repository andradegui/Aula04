package com.example.aula04


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.example.aula04.databinding.ActivityTemperaturaBinding
//import kotlinx.android.synthetic.main.activity_temperatura.*

class TemperaturaActivity : AppCompatActivity() {

    lateinit var binding: ActivityTemperaturaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTemperaturaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val editValor: EditText = findViewById(R.id.valTemp)
        val editResult: EditText = findViewById(R.id.valResult)
        val grupoTemperatura: RadioGroup = findViewById(R.id.grupoTemperatura)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)*/



        binding.btnCalcular.setOnClickListener {

            if (binding.editValor.text.isNotEmpty()) {
                val valor = binding.editValor.text.toString().toFloat()

                when (binding.grupoTemperatura.checkedRadioButtonId) {
                    R.id.btnKelvin -> {
                        val resultado = valor + 273
                        binding.editResult.setText(resultado.toString())
                    }
                    R.id.btnFahrenheit -> {
                        val resultado = valor * 1.8 + 32
                        binding.editResult.setText(resultado.toString())
                    }
                    else -> {
                        binding.editResult.setText("informe um valor valido")
                    }
                }
            } else {
                binding.                                                            editResult.setText("Digite um valorn de temperatura")
            }
        }
    }
}

















