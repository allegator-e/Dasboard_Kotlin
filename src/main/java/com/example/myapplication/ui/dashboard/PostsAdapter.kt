package com.example.myapplication.ui.dashboard

import android.content.Context
import android.icu.number.NumberRangeFormatter.with
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Post
import com.squareup.picasso.Picasso

class PostsAdapter(val posts: ArrayList<Post>, val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val TYPE_POST: Int = 0
        const val TYPE_AD: Int = 1
    }

    override fun getItemCount() = posts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.post_row, parent, false)
            return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            (holder as ViewHolder).username.text = posts[position].username
            holder.text.text = posts[position].text
            //Picasso.get().load(posts[position].photo).placeholder(R.drawable.ic_home_black_24dp).into(holder.photo)
            Picasso.get().load("https://www.bikeinn.com/f/13758/137587629/gurpil-nainer-29-6b-disc-mtb-front-wheel.jpg").placeholder(R.drawable.ic_home_black_24dp).into(holder.photo)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val username: TextView = itemView.findViewById(R.id.username)
        val text: TextView = itemView.findViewById(R.id.text)
        val photo: ImageView = itemView.findViewById(R.id.photo)
    }

    class AdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photo: ImageView = itemView.findViewById(R.id.photo)
//        this is an ad. Insert ad text here
    }
}