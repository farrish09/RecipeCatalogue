package com.singaperbangsaluthfifarizqi.resepcatalogue.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.singaperbangsaluthfifarizqi.resepcatalogue.R
import com.singaperbangsaluthfifarizqi.resepcatalogue.databinding.FragmentSeafoodBinding

class SeafoodFragment : Fragment() {

    private var binding: FragmentSeafoodBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSeafoodBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}