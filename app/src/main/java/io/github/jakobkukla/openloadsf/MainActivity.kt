package io.github.jakobkukla.openloadsf

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_LINK = "io.github.openloadsf.LINK"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fetchLink(view: View) {
        val editText = findViewById<EditText>(R.id.editText1)
        val link = editText.text.toString()
        val intent = Intent(this, FetchStreamActivity::class.java).apply {
            putExtra(EXTRA_LINK, link)
        }
        startActivity(intent)
    }
}
