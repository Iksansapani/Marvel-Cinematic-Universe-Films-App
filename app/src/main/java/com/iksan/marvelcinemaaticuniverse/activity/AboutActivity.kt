package com.iksan.marvelcinemaaticuniverse.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.iksan.marvelcinemaaticuniverse.R

class AboutActivity : AppCompatActivity() {
    lateinit var imginstagram: ImageView
    lateinit var imgtwiter: ImageView
    lateinit var imgyoutube: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        actionbar.setDisplayHomeAsUpEnabled(true)

        imginstagram = findViewById(R.id.btn_instagram)
        imgtwiter = findViewById(R.id.btn_twiter)
        imgyoutube = findViewById(R.id.btn_yutube)

        imginstagram.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/ikhsannn16?igshid=MzMyNGUyNmU2YQ=="))
            )
        }
        imgtwiter.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/iksansapani"))
            )
        }
        imgyoutube.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@iksansapani?si=Gi2ds956nP9oYeKd"))
            )
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
