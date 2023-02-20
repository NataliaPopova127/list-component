package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class NewsAdapter(context: Context?, resource: Int, private var states: List<News>?) :
    ArrayAdapter<News>(context!!, resource, states!!) {
    private var inflater: LayoutInflater? = null
    private var layout = resource

    init {
        inflater = LayoutInflater.from(context)
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = inflater!!.inflate(layout, parent, false)
        val imageView: ImageView = view.findViewById(R.id.ivNews)
        val titleView: TextView = view.findViewById(R.id.tvTitle)
        val news: News = states!![position]
        imageView.setImageResource(news.getImage())
        titleView.text = news.getTitle()
        return view
    }
}