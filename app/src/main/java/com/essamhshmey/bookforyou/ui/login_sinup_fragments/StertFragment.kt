package com.essamhshmey.bookforyou.ui.login_sinup_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.essamhshmey.bookforyou.R
import com.essamhshmey.bookforyou.databinding.FragmentSplashBinding
import com.essamhshmey.bookforyou.databinding.FragmentStertBinding

class StertFragment : Fragment() {
    private lateinit var binding: FragmentStertBinding
    private lateinit var mNavController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     mNavController=findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentStertBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSinup.setOnClickListener{
            mNavController.navigate(R.id.action_stertFragment_to_sinUPFragment)
        }
        binding.btnSinin.setOnClickListener{
            mNavController.navigate(R.id.action_stertFragment_to_sinINFragment)

        }
    }

}