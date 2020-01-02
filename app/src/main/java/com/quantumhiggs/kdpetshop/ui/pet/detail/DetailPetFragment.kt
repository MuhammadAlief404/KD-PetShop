package com.quantumhiggs.kdpetshop.ui.pet.detail


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.text.isDigitsOnly
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.quantumhiggs.kdpetshop.R
import com.quantumhiggs.kdpetshop.model.Pets
import kotlinx.android.synthetic.main.fragment_detail_pet.*


class DetailPetFragment : Fragment() {

    private var isFavorited = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_pet, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val args by navArgs<DetailPetFragmentArgs>()
        val pet = args.pet

        txt_pet_name.text = "${pet.age} ${pet.race} ${pet.type} (${pet.sex})"
        Glide.with(context!!)
            .load(pet.image)
            .into(img_pet)

        btn_adopt.setOnClickListener{
            if(edt_phone_number.text.isNullOrEmpty()) {
                buildDialog("Phone number can't be empty", "Error")
            }else   {
                if(edt_phone_number.text!!.length < 10) {
                    buildDialog("Phone number less than 10 digit", "Error")
                }
                if (!edt_phone_number.text!!.isDigitsOnly()) {
                    buildDialog("Can't filled with characters", "Error")
                }
                else {
                    buildDialog("Our team will call you soon", "Congratulation")
                }
            }
        }

        btn_love.setOnClickListener{
            if (isFavorited) {
                isFavorited = false
                btn_love.background = resources.getDrawable(R.drawable.ic_favorited)
            }else {
                isFavorited = true
                btn_love.background = resources.getDrawable(R.drawable.ic_favorite)
            }
        }

        btn_share.setOnClickListener {
            sharePet(pet)
        }
    }

    fun buildDialog(msg : String, title : String) {
        val builder = AlertDialog.Builder(context!!)
        builder.setTitle(title)
        builder.setMessage(msg)

        builder.setNeutralButton("Alright"){_,_ ->
        }

        val dialog: AlertDialog = builder.create()

        dialog.show()
    }

    fun sharePet(pet : Pets){
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "${pet.age} ${pet.race} ${pet.type} (${pet.sex}) is needs you right now")
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)

    }
}
