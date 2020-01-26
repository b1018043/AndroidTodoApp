package com.example.b1018043.todoapp

import android.view.View
import com.example.b1018043.todoapp.databinding.ItemListBinding
import com.xwray.groupie.databinding.BindableItem
import java.security.acl.Group


class TodoItem(private val text: String,private val delete: (TodoItem)->Unit): BindableItem<ItemListBinding>(){
    override fun getLayout(): Int {
        return R.layout.item_list
    }

    override fun bind(viewBinding: ItemListBinding, position: Int) {
        viewBinding.text = text
        viewBinding.button.setOnClickListener { delete(this) }
    }
}