package com.iksan.marvelcinemaaticuniverse.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.iksan.marvelcinemaaticuniverse.R
import com.iksan.marvelcinemaaticuniverse.activity.DetailActivity
import com.iksan.marvelcinemaaticuniverse.model.Marvel

class ListCharAdapter(private val listChar: ArrayList<Marvel>) : RecyclerView.Adapter<ListCharAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_char, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val marvelChar = listChar[position]
        Glide.with(holder.itemView.context)
            .load(marvelChar.pic)
            .apply(RequestOptions())
            .into(holder.picture)
        holder.name.text = marvelChar.name
        holder.genre.text = marvelChar.genre
        holder.sutradara.text = marvelChar.sutradara
        holder.itemView.setOnClickListener {
            val passItem = Intent(context, DetailActivity::class.java)
            passItem.putExtra(DetailActivity.EXTRA_NAME, marvelChar.name)
            passItem.putExtra(DetailActivity.EXTRA_GENRE, marvelChar.genre)
            passItem.putExtra(DetailActivity.EXTRA_SUTRADARA,marvelChar.sutradara)
            passItem.putExtra(DetailActivity.EXTRA_DURATION, marvelChar.duration)
            passItem.putExtra(DetailActivity.EXTRA_INTRO, marvelChar.synopsis)
            passItem.putExtra(DetailActivity.EXTRA_PIC, marvelChar.pic)
            passItem.putExtra(DetailActivity.EXTRA_PICBG, marvelChar.background)
            passItem.putExtra(DetailActivity.EXTRA_LINK, marvelChar.charlink)
            context.startActivity(passItem)
        }
    }

    override fun getItemCount(): Int {
        return listChar.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.char_name)
        var genre: TextView = itemView.findViewById(R.id.char_genre)
        var sutradara: TextView = itemView.findViewById(R.id.char_sutradara)
        var picture: ImageView = itemView.findViewById(R.id.char_pic)
    }
}