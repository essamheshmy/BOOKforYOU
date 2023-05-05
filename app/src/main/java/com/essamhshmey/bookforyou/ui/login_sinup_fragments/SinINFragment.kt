package com.essamhshmey.bookforyou.ui.login_sinup_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.essamhshmey.bookforyou.R
import com.essamhshmey.bookforyou.databinding.FragmentSinINBinding


class SinINFragment : Fragment() {
    private lateinit var binding: FragmentSinINBinding
    private lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mNavController=findNavController()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSinINBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSinin.setOnClickListener{
            mNavController.navigate(R.id.action_sinINFragment_to_containerFragment)
        }
        binding.btnSinup.setOnClickListener{
            mNavController.navigate(R.id.action_sinINFragment_to_sinUPFragment)
        }
    }

}