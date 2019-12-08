package com.example.dream.fragment.core

import android.view.View
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.example.dream.R
import com.example.dream.activity.core.FragmentFeedback

abstract class BaseFragment : Fragment() {

    fun changeFragment(fragment : FragmentData) {
        (activity as FragmentFeedback).changeFragment(fragment)
    }

    fun fadeInAnimation(view: View) {
        val animation = AnimationUtils.loadAnimation(activity, R.anim.fade_in)
        view.startAnimation(animation)
    }
}