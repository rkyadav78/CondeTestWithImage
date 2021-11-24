package com.e.condetestwithimage.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.e.condetestwithimage.R
import com.e.condetestwithimage.model.ModelResponse
import com.e.condetestwithimage.util.getProgressDrawable
import com.e.condetestwithimage.util.loadImage
import com.e.condetestwithimage.view.DetailsActivity
import kotlinx.android.synthetic.main.row_item.view.*

class MainAdapter(var userList: ArrayList<ModelResponse.Article>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    fun updateUserList(newUserList: List<ModelResponse.Article>) {
        userList.clear()
        userList.addAll(newUserList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.row_item,
            parent,
            false
        )
    )

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(userList[position])
        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(v?.context, DetailsActivity::class.java)
                intent.putExtra("USER_DETAILS",userList[position])
                v?.context?.startActivity(intent)
            }
        })
    }

    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val name = view.tvName
        private val email = view.tvEmail
        //private val cell = view.tvCell
        private val image = view.imageView
        private val progressDrawable = getProgressDrawable(view.context)

        fun bind(response: ModelResponse.Article) {
            val nameText = "author: " + response.author
            name.text = nameText
            val emailText = "Title: " + response.title
            email.text = emailText
//            val cellText = "Description: " + response.description
//            cell.text = cellText
            image.loadImage(response.urlToImage, progressDrawable)
        }

    }
}