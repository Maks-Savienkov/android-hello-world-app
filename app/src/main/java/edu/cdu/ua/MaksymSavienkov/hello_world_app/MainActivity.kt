package edu.cdu.ua.MaksymSavienkov.hello_world_app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var vm: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        val startButton = findViewById<Button>(R.id.button_send)

        vm = ViewModelProvider(this, MainViewModelFactory(this))[MainViewModel::class.java]

        vm.fieldLive.observe(this) { text ->
            textView.text = text
        }

        startButton.setOnClickListener {
            vm.changeToCaps()
        }
    }
}