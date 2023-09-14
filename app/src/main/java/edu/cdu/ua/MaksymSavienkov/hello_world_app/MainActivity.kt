package edu.cdu.ua.MaksymSavienkov.hello_world_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeToCaps(view: View) {
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = textView.text.toString().uppercase()
    }
}