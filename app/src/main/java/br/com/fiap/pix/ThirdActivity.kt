package br.com.fiap.pix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    private lateinit var transferValueText: TextView
    private lateinit var pixKeyText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val transferValue = intent.getStringExtra("transferValue")
        val pixKey = intent.getStringExtra("pixKey")

        transferValueText = findViewById(R.id.transferValueText)
        transferValueText.text = getString(R.string.transfer_value, transferValue)

        pixKeyText = findViewById(R.id.pixKeyText)
        pixKeyText.text = getString(R.string.pix_key, pixKey)

        val confirmTransferButton: Button = findViewById(R.id.confirmTransferButton)
        confirmTransferButton.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        val revisePixKeyButton: Button = findViewById(R.id.revisePixKeyButton)
        revisePixKeyButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("transferValue", transferValue)
            startActivity(intent)
        }
    }
}
