package com.example.linear

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ll : AppCompatActivity() {
    var to: EditText? = null
    var subject: EditText? = null
    var message: EditText? = null
    var send: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        to = findViewById(R.id.to)
        subject = findViewById(R.id.subject)
        message = findViewById(R.id.message)
        send = findViewById(R.id.send)
    }
}