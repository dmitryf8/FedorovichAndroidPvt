package by.itacademy.pvt.homework.dz8

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import by.itacademy.pvt.homework.R
import by.itacademy.pvt.homework.load

class DZ8ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val itemImageView = view.findViewById<ImageView>(R.id.itemImageViewDZ6)
    val itemTextView = view.findViewById<TextView>(R.id.itemTextViewDZ6)

    fun bind(student: Student) {

        load(itemImageView, student.url)
        itemTextView.text = student.name
    }
}