package com.quantumhiggs.kdpetshop.ui.pet.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.quantumhiggs.kdpetshop.R
import com.quantumhiggs.kdpetshop.model.Pets
import kotlinx.android.synthetic.main.item_list_pet.view.*

class ListPetsAdapter(private val sports: List<Pets>) :
    RecyclerView.Adapter<ListPetsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_list_pet,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = sports.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bindItems(sports[position])

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(pet: Pets) {
            itemView.item_list_age.text = pet.age
            itemView.item_list_race.text = pet.race
            itemView.item_list_sex.text = pet.sex

            Glide.with(itemView.context)
                .load(pet.image)
                .into(itemView.item_list_image)

            itemView.item_list_detail.setOnClickListener {
                val direction = ListPetsFragmentDirections.actionToDetail(pet)
                it.findNavController().navigate(direction)
            }
        }
    }


}