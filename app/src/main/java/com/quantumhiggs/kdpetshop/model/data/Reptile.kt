package com.quantumhiggs.kdpetshop.model.data

import com.quantumhiggs.kdpetshop.R
import com.quantumhiggs.kdpetshop.model.Pets

object Reptile {
    private val race = arrayOf(
        "Karma Bali Python",
        "Mexican Black Kingsnack",
        "Pled Pectinata",
        "Verrucosus Charmelon"
    )
    private val age = arrayOf(
        "2 Years",
        "4 Years",
        "3 Years",
        "7 Years"
    )
    private val sex = arrayOf(
        "Male",
        "Male",
        "Male",
        "Male"
    )
    private val image = intArrayOf(
        R.drawable.karma_bali_python,
        R.drawable.mexican_black_kingsnack,
        R.drawable.pled_pectinata,
        R.drawable.verrucosus_charmelon
    )

    val listReptile : ArrayList<Pets>
        get() {
            val list = arrayListOf<Pets>()
            for (position in race.indices) {
                val pet = Pets()
                pet.race = race[position]
                pet.age = age[position]
                pet.sex = sex[position]
                pet.image= image[position]
                pet.type = "Reptile"
                list.add(pet)
            }
            return list
        }
}