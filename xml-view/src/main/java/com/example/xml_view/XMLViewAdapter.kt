package com.example.xml_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class XMLViewAdapter(private val items: List<XMLViewItem>) :
    RecyclerView.Adapter<XMLViewAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val content: LinearLayout = view.findViewById(R.id.contents)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): XMLViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: XMLViewAdapter.ViewHolder, position: Int) {
        holder.apply {
            content.findViewById<TextView>(R.id.title).text = items[position].title
            content.findViewById<TextView>(R.id.description).text = items[position].description
        }
    }

    override fun getItemCount(): Int = items.size
}