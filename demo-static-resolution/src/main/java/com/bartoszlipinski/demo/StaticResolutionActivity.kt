@file:Suppress("unused")

package com.bartoszlipinski.demo

import android.app.Activity
import android.os.Bundle
import android.view.ViewGroup
import butterknife.BindView
import com.bartoszlipinski.butterknifektx.ButterKnifeKtx
import com.bartoszlipinski.butterknifektx.bind

class StaticResolutionActivity : Activity() {

    @BindView(R.id.example_layout)
    lateinit var exampleLayout: ViewGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        correctResolution()
        incorrectResolution()
    }











    private fun correctResolution() {
        val staticResolutionActivity: StaticResolutionActivity = this
        ButterKnifeKtx.bind(staticResolutionActivity)
    }















    private fun incorrectResolution() {
        val staticResolutionActivity: StaticResolutionActivity = this
        val activity: Activity = staticResolutionActivity
        ButterKnifeKtx.bind(activity)
    }
}
