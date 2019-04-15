@file:Suppress("unused")

package com.bartoszlipinski.demo

import android.app.Activity
import android.os.Bundle
import android.view.ViewGroup
import butterknife.BindView
import butterknife.ButterKnife
import com.bartoszlipinski.butterknifektx.ButterKnifeKtx
import com.bartoszlipinski.butterknifektx.bind

class SimpleDemoActivity : Activity() {

    @BindView(R.id.example_layout)
    lateinit var exampleLayout: ViewGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)
        ButterKnifeKtx.bind(this)
    }
}
