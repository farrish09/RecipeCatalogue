package com.singaperbangsaluthfifarizqi.resepcatalogue.adapter


import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.singaperbangsaluthfifarizqi.resepcatalogue.DetailActivity
import com.singaperbangsaluthfifarizqi.resepcatalogue.data.Recipes
import com.singaperbangsaluthfifarizqi.resepcatalogue.databinding.RowItemFoodBinding

class RecipesAdapter(private val listRecipes: ArrayList<Recipes>) :
    RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: RowItemFoodBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listRecipes[position]) {
                tvFood.text = name
                tvFoodCategory.text = category
                tvPriceFood.text = price

                // Load image from url
                Glide.with(imgFood.context).load(photo).into(imgFood)
            }
        } // Holder akan ngebinding sekalian index number listrecipes

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.DATA_RECIPES, listRecipes[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = listRecipes.size

}



