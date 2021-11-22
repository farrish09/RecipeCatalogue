package com.singaperbangsaluthfifarizqi.resepcatalogue.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.singaperbangsaluthfifarizqi.resepcatalogue.adapter.RecipesAdapter
import com.singaperbangsaluthfifarizqi.resepcatalogue.data.DataRecipes
import com.singaperbangsaluthfifarizqi.resepcatalogue.databinding.FragmentDessertBinding

class DessertFragment : Fragment() {

private var _binding: FragmentDessertBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {


    _binding =FragmentDessertBinding.inflate(inflater, container, false)
    return  binding.root
  }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDessert.apply {
            layoutManager = GridLayoutManager(activity,2)
            adapter = RecipesAdapter(DataRecipes.listDessert)
        }
    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}