package com.example.b1018043.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.xwray.groupie.Group
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val groupAdapter = GroupAdapter<ViewHolder>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.adapter = groupAdapter
        addButton.setOnClickListener {
            groupAdapter.add(TodoItem(input.text.toString(),{item:Group ->groupAdapter.remove(item)}))
        }
    }
}
