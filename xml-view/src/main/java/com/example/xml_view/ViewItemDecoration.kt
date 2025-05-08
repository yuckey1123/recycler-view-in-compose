package com.example.xml_view

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ViewItemDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        // RecyclerViewのアイテムの間隔を設定
        outRect.bottom = 20
        outRect.top = 0
        outRect.left = 0
        outRect.right = 0
    }
}