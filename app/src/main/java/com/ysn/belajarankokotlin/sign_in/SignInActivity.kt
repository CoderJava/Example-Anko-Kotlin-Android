package com.ysn.belajarankokotlin.sign_in

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.ysn.belajarankokotlin.R
import org.jetbrains.anko.setContentView

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_sign_in)*/
        SignInView().setContentView(this)

    }
}
