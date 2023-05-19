package br.com.fiap.pix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.NumberFormat
import java.util.*

class SecondActivity : AppCompatActivity() {
    private lateinit var pixKeyInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val transferValue = intent.getStringExtra("transferValue")
        val formattedTransferValue = transferValue?.toDoubleOrNull()?.let { formatCurrency(it) } ?: ""

        val transferValueText: TextView = findViewById(R.id.transferValueText)
        transferValueText.text = getString(R.string.transfer_to_whom, formattedTransferValue)

        pixKeyInput = findViewById(R.id.pixKeyInput)
        val continueButton: Button = findViewById(R.id.continueButton)

        continueButton.setOnClickListener {
            val pixKey = pixKeyInput.text.toString()

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("transferValue", transferValue)
            intent.putExtra("pixKey", pixKey)
            startActivity(intent)
        }
    }

    private fun formatCurrency(value: Double): String {
        val currencyFormat = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
        return currencyFormat.format(value)
    }
}
