package com.example.dream.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.dream.R
import com.example.dream.fragment.core.BaseFragment
import com.example.dream.fragment.core.FragmentData

class PositiveFragment : BaseFragment() {

    private lateinit var positiveText : TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.positive_fragment, container, false)
        positiveText = view.findViewById(R.id.positive_text_view)
        positiveText.setOnClickListener{
            changeFragment(FragmentData.DREAM_FRAGMENT)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fadeInAnimation(positiveText)
    }
}