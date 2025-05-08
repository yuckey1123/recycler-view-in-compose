package com.example.xml_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class XMLViewActivity : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xml_view)
        supportActionBar?.title = "RecyclerView XML"

        val recyclerView = findViewById<RecyclerView>(R.id.xml_recycler_view)

        val items = List(100) { index ->
            XMLViewItem(
                title = "Item $index",
                description = "${index}番目のアイテムです"
            )
        }

        recyclerView.adapter = XMLViewAdapter(items)
        recyclerView.layoutManager =
            LinearLayoutManager(this)
        recyclerView.addItemDecoration(
            ViewItemDecoration()
        )
    }
}
