package com.example.dream.activity

import android.os.Bundle
import com.example.dream.R
import com.example.dream.activity.core.BasicActivity
import com.example.dream.fragment.DreamFragment
import com.example.dream.fragment.PositiveFragment
import com.example.dream.fragment.core.FragmentData

class MainActivity : BasicActivity() {

    private val container = R.id.fragment_container

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null) {
            supportFragmentManager.inTransaction {
                add(container, DreamFragment())
            }
        }
    }

    override fun changeFragment(fragment: FragmentData) {
        val fragmentToInit = when(fragment) {
            FragmentData.DREAM_FRAGMENT -> DreamFragment()
            FragmentData.POSITIVE_FRAGMENT -> PositiveFragment()
        }

        supportFragmentManager.inTransaction {
            replace(container, fragmentToInit)
        }
    }
}
