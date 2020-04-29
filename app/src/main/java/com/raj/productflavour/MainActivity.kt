package com.raj.productflavour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raj.url.URlClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.DarkTheme)
        setContentView(R.layout.activity_main)
        textfield.text= URlClass().mUrlString.toString()


    }
}
