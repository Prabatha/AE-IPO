package com.example.latihanmobileapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.latihanmobileapp.R
import com.example.latihanmobileapp.UserData.MyApp

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)


        val loginButton = findViewById<Button>(R.id.loginButton)
        val namaEditText = findViewById<TextView>(R.id.username)
        val passwordEditText = findViewById<TextView>(R.id.password)
        val userDao = MyApp.database.userDao()

        loginButton.setOnClickListener {
            val username = namaEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Memeriksa apakah pengguna dengan username yang sesuai ada di database
            userDao.getUserByUsername(username).observe(this, { user ->
                if (user != null && user.password == password) {
                    // Login berhasil, lanjutkan ke halaman utama atau halaman lain
                    val intent = Intent(this, homePage::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out)
                } else {
                    // Login gagal, tampilkan pesan kesalahan atau tindakan lain
                }
            })
        }

        val textClick = findViewById<TextView>(R.id.regiser)
        textClick.setOnClickListener {
            val intent = Intent(this, RegistPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out)
        }
    }
}