package com.actia.arch.mvvm.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.actia.arch.R
import com.actia.arch.mvvm.model.UserMVVM

class UserMVVMAdapter(val users: List<UserMVVM>) : RecyclerView.Adapter<UserMVVMAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.textViewName.text = users[position].name
        holder.textViewEmail.text = users[position].email

    }

    override fun getItemCount() = users.size

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName = itemView.findViewById<TextView>(R.id.textViewName)
        val textViewEmail = itemView.findViewById<TextView>(R.id.textViewEmail)
    }
}

