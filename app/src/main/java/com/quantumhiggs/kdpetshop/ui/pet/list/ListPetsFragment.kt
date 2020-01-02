package com.quantumhiggs.kdpetshop.ui.pet.list


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayout
import com.quantumhiggs.kdpetshop.R
import com.quantumhiggs.kdpetshop.model.Pets
import com.quantumhiggs.kdpetshop.model.data.Cat
import com.quantumhiggs.kdpetshop.model.data.Dog
import com.quantumhiggs.kdpetshop.model.data.Reptile
import com.quantumhiggs.kdpetshop.model.data.SugarGlider
import kotlinx.android.synthetic.main.fragment_list_pets.*

/**
 * A simple [Fragment] subclass.
 */
class ListPetsFragment : Fragment() {

    private val list : ArrayList<Pets> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_pets, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listControl("Cat")

        tab_pet.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
                listControl(p0!!.text.toString())
            }

        })
    }

    private fun listControl(type : String) {
        list.clear()
        when(type) {
            "Cat" -> list.addAll(Cat.listCat)
            "Dog" -> list.addAll(Dog.listDog)
            "Reptile" -> list.addAll(Reptile.listReptile)
            "Sugar Glider" -> list.addAll(SugarGlider.listGlider)
        }
        rv_list_pet.layoutManager = LinearLayoutManager(context)
        rv_list_pet.adapter = ListPetsAdapter(list)
    }
}
