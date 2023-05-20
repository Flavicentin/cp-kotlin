package br.com.fiap.pix

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    private lateinit var successMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val transferValue = intent.getStringExtra("transferValue")
        val pixKey = intent.getStringExtra("pixKey")

        successMessage = findViewById(R.id.successMessage)
        successMessage.text = getString(R.string.transfer_success, transferValue, pixKey)
    }
}
