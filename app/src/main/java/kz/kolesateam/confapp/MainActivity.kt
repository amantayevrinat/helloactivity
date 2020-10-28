package kz.kolesateam.confapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kz.hello.presentation.HelloActivity
import android.util.Log.d as d1

private const val TAG = "MainActivityON"
class MainActivity : AppCompatActivity() {

    private val openHelloButton:Button by lazy {
       findViewById(R.id.activity_main_hello_button)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        openHelloButton.setOnClickListener {
            val helloScreenIntent = Intent(this, HelloActivity::class.java)
            startActivity(helloScreenIntent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        Log.d(TAG,"onPause")
        super.onPause()

    }

    override fun onStop() {
        Log.d(TAG,"onStop")
        super.onStop()
    }
}
