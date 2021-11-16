package com.singaperbangsaluthfifarizqi.resepcatalogue.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.singaperbangsaluthfifarizqi.resepcatalogue.adapter.RecipesAdapter
import com.singaperbangsaluthfifarizqi.resepcatalogue.data.DataRecipes
import com.singaperbangsaluthfifarizqi.resepcatalogue.databinding.FragmentBreakfastBinding

class BreakfastFragment : Fragment() {

    private var binding : FragmentBreakfastBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.


  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentBreakfastBinding.inflate(inflater, container, false)
    return binding!!.root

  }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.rvBreakfast?.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(activity , 2)
            adapter = RecipesAdapter(DataRecipes.listBreakfast)
        }
    }

    override fun onDestroy() { // Sudah menjadi bagian dalam fragment
        super.onDestroy()
       binding= null // binding dikosongkan lagi
    }
}