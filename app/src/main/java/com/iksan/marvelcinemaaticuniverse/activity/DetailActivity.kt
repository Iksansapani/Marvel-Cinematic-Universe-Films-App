package com.iksan.marvelcinemaaticuniverse.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.iksan.marvelcinemaaticuniverse.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_SUTRADARA = "extra_sutradara"
        const val EXTRA_LINK = "extra_link"
        const val EXTRA_PICBG = "extra_picbg"
        const val EXTRA_PIC = "extra_pic"
        const val EXTRA_INTRO = "extra_intro"
        const val EXTRA_DURATION= "extra_duration"
        const val EXTRA_GENRE = "extra_ genre"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvCharName: TextView = findViewById(R.id.char_name)
        val tvCharGenre: TextView = findViewById(R.id.char_genre)
        val tvCharSutradara: TextView = findViewById(R.id.sutradara)
        val tvCharDuration: TextView = findViewById(R.id.char_duration)
        val tvCharIntro: TextView = findViewById(R.id.char_descrip)
        val imgCharPic: ImageView = findViewById(R.id.char_pic)
        val imgCharPicbg: ImageView = findViewById(R.id.char_bg)
        val shareButton: Button = findViewById(R.id.btn_share)

        val charName = intent.getStringExtra(EXTRA_NAME)
        val charGenre = intent.getStringExtra(EXTRA_GENRE)
        val charSutradara = intent.getStringExtra(EXTRA_SUTRADARA)
        val charDuration = intent.getStringExtra(EXTRA_DURATION)
        val charIntro = intent.getStringExtra(EXTRA_INTRO)
        val charPic = intent.getIntExtra(EXTRA_PIC, 0)
        val charPicbg = intent.getIntExtra(EXTRA_PICBG, 0)
        val charLink = intent.getStringExtra(EXTRA_LINK)

        tvCharName.text = charName
        tvCharGenre.text = charGenre
        tvCharIntro.text = charDuration
        tvCharSutradara.text = charSutradara
        tvCharIntro.text = charIntro
        Glide.with(this)
            .load(charPic)
            .apply(RequestOptions())
            .into(imgCharPic)
        Glide.with(this)
            .load(charPicbg)
            .apply(RequestOptions())
            .into(imgCharPicbg)
        shareButton.setOnClickListener {
            val goShare = Intent()
            goShare.action = Intent.ACTION_SEND
            goShare.putExtra(Intent.EXTRA_TEXT, "Hey look at this movie : $charLink")
            goShare.type = "text/plain"
            startActivity(Intent.createChooser(goShare, "Share To:"))
        }

    }

}