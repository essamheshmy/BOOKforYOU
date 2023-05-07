package com.essamhshmey.bookforyou.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.essamhshmey.bookforyou.R
import com.essamhshmey.bookforyou.databinding.ActivityContainerBinding
import com.essamhshmey.bookforyou.databinding.FragmentContainerBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContainerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContainerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.bottomNavigationView
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.


        navView.setupWithNavController(navController)

    }
}