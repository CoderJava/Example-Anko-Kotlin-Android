package com.ysn.belajarankokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ysn.belajarankokotlin.sign_in.SignInActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, SignInActivity::class.java))
    }
}
