package com.example.alex.keycode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        keyCodeView.requestFocus();

        keyCodeView.setOnKeyListener({ v, keyCode, event ->
            val actionString = when(event.action){
                KeyEvent.ACTION_DOWN -> "DOWN"
                KeyEvent.ACTION_UP -> "UP"
                else->"?"
            }

            val codeString = keyCode.toString()
            keyCodeView.text = codeString
            logView.setText("$codeString ($actionString)")
            true
        })
    }
}
