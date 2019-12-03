package com.quantumhiggs.kdpetshop.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.quantumhiggs.kdpetshop.R
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val args by navArgs<HomeFragmentArgs>()
        val username = args.username

        imageSlider_home.sliderAdapter = SliderAdapter()
        imageSlider_home.setIndicatorAnimation(IndicatorAnimations.WORM)
        imageSlider_home.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)

        lbl_welcome_home.text = "Welcome $username"

        btn_adopt_pet_home.setOnClickListener {
            val direction = HomeFragmentDirections.actionToList()
            it.findNavController().navigate(direction)
        }

        btn_about_us_home.setOnClickListener {
            val direction = HomeFragmentDirections.actionToAboutUs()
            it.findNavController().navigate(direction)
        }
    }
}
