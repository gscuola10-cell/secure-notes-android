package it.MingioneGhidelli.securenotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import it.MingioneGhidelli.securenotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSalva.setOnClickListener {
            val testo = binding.etNota.text.toString().trim()
            binding.tvRisultato.text =
                if (testo.isEmpty()) "Nota vuota!" else "Hai scritto: $testo"
        }
    }
}