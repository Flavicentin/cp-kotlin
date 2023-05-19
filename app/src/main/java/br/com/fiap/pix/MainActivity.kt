package br.com.fiap.pix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var transferValueInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        transferValueInput = findViewById(R.id.transferValueInput)
        val continueButton: Button = findViewById(R.id.continueButton)

        continueButton.setOnClickListener {
            val transferValue = transferValueInput.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("transferValue", transferValue)
            print(transferValue)
            startActivity(intent)
        }
    }
}
