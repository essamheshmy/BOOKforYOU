package com.essamhshmey.bookforyou.ui.btn_navigation_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.essamhshmey.bookforyou.R
import com.essamhshmey.bookforyou.databinding.FragmentTrendBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class TrendFragment : Fragment() {
    private lateinit var binding: FragmentTrendBinding
    private lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mNavController=findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentTrendBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_trend, container, false)
        return binding.root
    }


}