package com.cuteninja.shf.kotlin.shfkotlin

import android.os.Bundle
import com.cuteninja.shf.kotlin.shfkotlin.common.AbstractDrawerActivity

class HomeActivity : AbstractDrawerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        super.addActionBar()
    }
}
