package com.example.dream.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.dream.R
import com.example.dream.fragment.core.BaseFragment
import com.example.dream.fragment.core.FragmentData

class DreamFragment : BaseFragment() {

    private lateinit var dreamText : TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dream_fragment, container, false)
        dreamText = view.findViewById(R.id.dream_text_view)
        dreamText.setOnClickListener{
            changeFragment(FragmentData.POSITIVE_FRAGMENT)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fadeInAnimation(dreamText)
    }
}