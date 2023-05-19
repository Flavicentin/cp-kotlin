package br.com.fiap.pix

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val transferValue = intent.getStringExtra("transferValue")
        val pixKey = intent.getStringExtra("pixKey")

        val successMessage: TextView = findViewById(R.id.successMessage)
        successMessage.text = getString(R.string.transfer_success, transferValue, pixKey)
        successMessage.text = transferValue + getString(R.string.transfer_success) + pixKey
    }
}
