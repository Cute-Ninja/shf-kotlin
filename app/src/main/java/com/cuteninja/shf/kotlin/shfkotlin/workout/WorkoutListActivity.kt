package com.cuteninja.shf.kotlin.shfkotlin.workout

import android.os.Bundle
import com.cuteninja.shf.kotlin.shfkotlin.R
import com.cuteninja.shf.kotlin.shfkotlin.common.AbstractDrawerActivity

class WorkoutListActivity : AbstractDrawerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_list)
    }
}
