package com.quantumhiggs.kdpetshop.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.quantumhiggs.kdpetshop.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_login.setOnClickListener {
            when {
                edt_username_login.text.isNullOrEmpty() -> edt_username_login.error =
                    getString(R.string.error_empty_username)
                edt_password_login.text.isNullOrEmpty() -> edt_password_login.error =
                    getString(R.string.error_empty_password)
                edt_username_login.text.length < 6 -> edt_username_login.error =
                    getString(R.string.error_length_username)
                edt_password_login.text.length < 6 -> edt_password_login.error =
                    getString(R.string.error_length_password)
                else -> {
                    val direction =
                        LoginFragmentDirections.actionToHome(edt_username_login.text.toString())
                    it.findNavController().navigate(direction)
                }
            }
        }
    }
}
