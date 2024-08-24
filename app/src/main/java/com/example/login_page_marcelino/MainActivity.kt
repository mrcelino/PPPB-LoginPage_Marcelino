package com.example.login_page_marcelino

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Temukan EditText dan Button dari layout
        val usernameEditText: EditText = findViewById(R.id.username)
        val loginButton: Button = findViewById(R.id.loginButton)

        // Set listener untuk tombol
        loginButton.setOnClickListener {
            // Ambil teks dari EditText
            val username = usernameEditText.text.toString()
            // Tampilkan Toast
            Toast.makeText(this, " $username", Toast.LENGTH_SHORT).show()
        }
    }
}
