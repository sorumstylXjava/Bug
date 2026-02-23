package com.example.kernvar

import android:content.intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
  override fun onCreate(savedinstanceState:Bundle?) {
    super.onCreate(savedinstanceState)
    setContentView(R.layout.activity_login)

    val usernameEditText: EditText = findViewByld(R.id.usernameEditText)
