package com.quantumhiggs.kdpetshop.model.data

import com.quantumhiggs.kdpetshop.R
import com.quantumhiggs.kdpetshop.model.Pets

object Dogs {
    private val race = arrayOf(
        "Shih Tzu",
        "Husky",
        "Golden",
        "Corgi"
    )
    private val age = arrayOf(
        "1 Year",
        "1 Year",
        "3 Years",
        "2 Years"
    )
    private val sex = arrayOf(
        "Male",
        "Female",
        "Male",
        "Female"
    )
    private val image = intArrayOf(
        R.drawable.shihtzu,
        R.drawable.husky,
        R.drawable.golden,
        R.drawable.corgi
    )

    val listDog : ArrayList<Pets>
    get() {
        val list = arrayListOf<Pets>()
        for (position in race.indices) {
            val pet = Pets()
            pet.race = race[position]
            pet.age = age[position]
            pet.sex = sex[position]
            pet.image= image[position]
            pet.type = "Dog"
            list.add(pet)
        }
        return list
    }
}