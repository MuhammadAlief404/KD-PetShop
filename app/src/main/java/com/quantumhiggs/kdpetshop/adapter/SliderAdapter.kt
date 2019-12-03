package com.quantumhiggs.kdpetshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.quantumhiggs.kdpetshop.R
import com.smarteist.autoimageslider.SliderViewAdapter
import kotlinx.android.synthetic.main.item_slider_image.view.*

class SliderAdapter : SliderViewAdapter<SliderAdapter.SliderAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterViewHolder =
        SliderAdapterViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_slider_image,
                parent,
                false
            )
        )

    override fun onBindViewHolder(viewHolder: SliderAdapterViewHolder, position: Int) =
        viewHolder.bindItems(position)

    override fun getCount(): Int = 4

    class SliderAdapterViewHolder(private val itemView: View) : SliderViewAdapter.ViewHolder(itemView) {
        fun bindItems(position: Int) {
            when(position) {
                0 -> Glide.with(itemView)
                    .load(R.drawable.dog)
                    .into(itemView.iv_auto_image_slider)
                1 -> Glide.with(itemView)
                    .load(R.drawable.cat)
                    .into(itemView.iv_auto_image_slider)
                2 -> Glide.with(itemView)
                    .load(R.drawable.glider)
                    .into(itemView.iv_auto_image_slider)
                3 -> Glide.with(itemView)
                    .load(R.drawable.iguana)
                    .into(itemView.iv_auto_image_slider)
            }
        }
    }

}