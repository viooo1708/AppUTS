package com.viona.apputs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {
    private lateinit var Tv_signUp : TextView
    private lateinit var btn_Login : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Tv_signUp = findViewById(R.id.tv_sigUp)
        btn_Login = findViewById(R.id.btn_Login2)

        Tv_signUp.setOnClickListener {
            // Navigasi ke halaman "Sign Up"
            val intent1 = Intent(this, SignUpPage::class.java)
            startActivity(intent1)
        }

        btn_Login.setOnClickListener {
            // Navigasi ke halaman "Sign Up"
            val intent1 = Intent(this, Makanan::class.java)
            startActivity(intent1)
        }
    }
}