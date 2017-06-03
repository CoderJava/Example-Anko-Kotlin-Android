package com.ysn.belajarankokotlin.sign_in

import com.ysn.belajarankokotlin.R
import org.jetbrains.anko.*

/**
 * Created by root on 31/05/17.
 */
class SignInView : AnkoComponent<SignInActivity> {

    override fun createView(ui: AnkoContext<SignInActivity>) =
            with(ui) {
                verticalLayout {
                    lparams(width = matchParent, height = matchParent)
                    setPadding(dip(16), dip(16), dip(16), dip(16))
                    editText {
                        id = R.id.usernameEditText
                        hintResource = R.string.sign_in_username
                        textSize = 24f
                    }.lparams(width = matchParent, height = wrapContent)
                    editText {
                        id = R.id.passwordEditText
                        hintResource = R.string.sign_in_password
                        textSize = 24f
                    }.lparams(width = matchParent, height = wrapContent)
                    button {
                        id = R.id.buttonSignIn
                        textResource = R.string.sign_in_button
                    }.lparams(width = matchParent, height = wrapContent)
                }
            }

}