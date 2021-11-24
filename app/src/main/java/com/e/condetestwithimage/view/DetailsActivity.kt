package com.e.condetestwithimage.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.e.condetestwithimage.R
import com.e.condetestwithimage.model.ModelResponse
import com.e.condetestwithimage.util.getProgressDrawable
import com.e.condetestwithimage.util.loadImage
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val modelResult = intent.getSerializableExtra("USER_DETAILS") as ModelResponse.Article
        val progressDrawable = getProgressDrawable(this)
        imgProfile.loadImage(modelResult.urlToImage,progressDrawable = progressDrawable)
        val fullName = "Author : "+modelResult.author
        tvName.text = fullName
        val email = "Title : "+modelResult.title
        tvEmail.text = email
        val gender = "Description : "+modelResult.description
        tvGender.text = gender
        val cell = "Content : "+modelResult.content
        tvCell.text = cell

    }
}
