package com.github.lhoyong.smoothcheckbox

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.lhoyong.checkbox.SmoothCheckBox
import kotlinx.android.synthetic.main.activity_sample.*

class SampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        scb.setOnCheckedChangeListener(object : SmoothCheckBox.OnCheckedChangeListener {
            override fun onCheckedChanged(checkBox: SmoothCheckBox, isChecked: Boolean) {
                Log.d("SmoothCheckBox", isChecked.toString())
            }

            override fun onCheckedAnimatedFinished(checkBox: SmoothCheckBox, isChecked: Boolean) {
                Log.d("SmoothCheckBox", isChecked.toString())
            }
        })
    }

}
