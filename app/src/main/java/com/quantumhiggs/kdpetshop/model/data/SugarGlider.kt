package com.quantumhiggs.kdpetshop.model.data

import com.quantumhiggs.kdpetshop.R
import com.quantumhiggs.kdpetshop.model.Pets

object SugarGlider {
    private val race = arrayOf(
        "Caramel",
        "Classic",
        "Leucistic",
        "Piebald"
    )
    private val age = arrayOf(
        "2 Years",
        "2 Years",
        "1 Year",
        "3 Years"

    )
    private val sex = arrayOf(
        "Male",
        "Female",
        "Female",
        "Female"
    )
    private val image = intArrayOf(
        R.drawable.caramel,
        R.drawable.classic,
        R.drawable.leucistic,
        R.drawable.piebald
    )

    val listGlider : ArrayList<Pets>
        get() {
            val list = arrayListOf<Pets>()
            for (position in race.indices) {
                val pet = Pets()
                pet.race = race[position]
                pet.age = age[position]
                pet.sex = sex[position]
                pet.image= image[position]
                pet.type = "Sugar Glider"
                list.add(pet)
            }
            return list
        }
}