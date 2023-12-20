package com.dicoding.kenari.view.chat

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.kenari.R
import com.dicoding.kenari.databinding.ActivityChatBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ChatActivity : AppCompatActivity() {
    private lateinit var binding : ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val newDiscussion = findViewById<FloatingActionButton>(R.id.btnAdd)
        newDiscussion.setOnClickListener {
            val intent = Intent(this, AddDiscussionActivity::class.java)
            startActivity(intent)
        }
        /*binding.btnAdd.setOnClickListener {
            val intent = Intent(this, AddDiscussionActivity::class.java)
            startActivity(intent)
        }*/

        supportActionBar?.title = "Chat"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#20BAB3")))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}