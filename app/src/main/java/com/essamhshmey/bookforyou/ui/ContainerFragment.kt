package com.essamhshmey.bookforyou.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.essamhshmey.bookforyou.R
import com.essamhshmey.bookforyou.databinding.FragmentContainerBinding
import com.essamhshmey.bookforyou.databinding.FragmentSinINBinding


class ContainerFragment : Fragment() {
    private lateinit var binding: FragmentContainerBinding
    private lateinit var mNavController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mNavController=findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentContainerBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }


}