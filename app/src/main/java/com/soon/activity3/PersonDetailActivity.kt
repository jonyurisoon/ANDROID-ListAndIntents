package com.soon.activity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soon.activity3.databinding.ActivityPersonDetailBinding

class PersonDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val subject = intent.getStringExtra("subject")
        val content = intent.getStringExtra("content")

        // Set the values using ViewBinding
        binding.nameTextView.text = name
        binding.subjectTextView.text = subject
        binding.contentTextView.text = content
    }
}