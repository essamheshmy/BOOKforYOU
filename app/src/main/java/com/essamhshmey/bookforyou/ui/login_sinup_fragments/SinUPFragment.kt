package com.essamhshmey.bookforyou.ui.login_sinup_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.essamhshmey.bookforyou.R
import com.essamhshmey.bookforyou.databinding.FragmentSinUPBinding


class SinUPFragment : Fragment() {
    private lateinit var binding: FragmentSinUPBinding
    private lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mNavController=findNavController()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSinUPBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }


}