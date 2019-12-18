package com.quantumhiggs.kdpetshop.model.data

import com.quantumhiggs.kdpetshop.R
import com.quantumhiggs.kdpetshop.model.Pets

object Cat {
    private val race = arrayOf(
        "Ragdoll",
        "Birman",
        "Toyger",
        "Turkish Van"
    )
    private val age = arrayOf(
        "1 Year",
        "2 Years",
        "1 Year",
        "4 Years"
    )
    private val sex = arrayOf(
        "Male",
        "Male",
        "Male",
        "Female"
    )
    private val image = intArrayOf(
        R.drawable.ragdoll,
        R.drawable.birman,
        R.drawable.toyger,
        R.drawable.turkish_van
    )

    val listCat: ArrayList<Pets>
        get() {
            val list = arrayListOf<Pets>()
            for (position in race.indices) {
                val pet = Pets()
                pet.race = race[position]
                pet.age = age[position]
                pet.sex = sex[position]
                pet.image = image[position]
                pet.type = "Cat"
                list.add(pet)
            }
            return list
        }
}