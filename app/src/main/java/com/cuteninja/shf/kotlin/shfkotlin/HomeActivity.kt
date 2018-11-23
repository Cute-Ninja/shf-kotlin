package com.cuteninja.shf.kotlin.shfkotlin

import android.os.Bundle
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import com.cuteninja.shf.kotlin.shfkotlin.common.AbstractDrawerActivity

class HomeActivity : AbstractDrawerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        intView()
    }

    private fun intView() {
        // @Todo replace by test about user connected
        if (true) {
            super.initDrawerAndToolbar()

            val frameLayout = findViewById<FrameLayout>(R.id.layout_content)
            layoutInflater.inflate(R.layout.activity_home, frameLayout, true)
        } else {
            // @Todo redirect to log screen
        }
    }
}
