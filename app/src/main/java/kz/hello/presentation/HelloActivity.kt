package kz.hello.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kz.kolesateam.confapp.R

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val finishHelloButton:Button = findViewById(R.id.activity_main_finish_button)
        finishHelloButton.setOnClickListener {
            finish()
        }
    }
}
