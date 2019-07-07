package com.lhoyong.smoothcheckbox

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample.setOnClickListener {
            startActivity(Intent(this, SampleActivity::class.java))
        }

        list.setOnClickListener { startActivity(Intent(this, SampleListViewActivity::class.java)) }
    }
}
