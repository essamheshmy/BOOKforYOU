package com.essamhshmey.bookforyou.ui.login_sinup_fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.essamhshmey.bookforyou.R

import com.essamhshmey.bookforyou.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding
    private lateinit var mNavController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mNavController=findNavController()
        binding=FragmentSplashBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            var l:Boolean=false

             if (l) {
                 mNavController.navigate(R.id.action_splashFragment_to_containerFragment)
             }else{
                 mNavController.navigate(R.id.action_splashFragment_to_stertFragment)
             }
        }
    }

}