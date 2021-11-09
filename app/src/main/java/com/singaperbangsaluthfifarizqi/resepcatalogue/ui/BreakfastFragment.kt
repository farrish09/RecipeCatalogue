package com.singaperbangsaluthfifarizqi.resepcatalogue.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.singaperbangsaluthfifarizqi.resepcatalogue.databinding.FragmentBreakfastBinding

class BreakfastFragment : Fragment() {

private var _binding: FragmentBreakfastBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    _binding = FragmentBreakfastBinding.inflate(inflater, container, false)
    return binding.root

  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}