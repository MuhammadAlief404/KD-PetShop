package com.quantumhiggs.kdpetshop.model.data

import com.quantumhiggs.kdpetshop.model.Pets

object Reptile {
    private val race = arrayOf("")
    private val age = arrayOf("")
    private val sex = arrayOf("")
    private val image = intArrayOf()

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