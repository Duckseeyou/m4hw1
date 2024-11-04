package com.m3.m4hw1.ui.fragments

import com.m3.m4hw1.User
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.isDigitsOnly
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.m3.m4hw1.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            loginBtn.setOnClickListener {

                val name = etName.text.toString()
                val email = etEmail.text.toString()
                var password = 0
                if (etPassword.text.toString().isDigitsOnly()){
                    password = etPassword.text.toString().toInt()
                }

                val user = User(name, email, password)

                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment(user))
            }
        }


    }
}