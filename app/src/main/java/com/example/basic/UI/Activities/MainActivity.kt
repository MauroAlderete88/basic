package com.example.basic.UI.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.basic.R
import com.example.basic.UI.viewmodel.viewModel
import com.example.basic.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity  : AppCompatActivity() {

     private val vm : viewModel by viewModels()

     lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonBuscar.setOnClickListener {
            vm.solicitarClub()
        }

        vm.club.observe(this,{
            binding.tituloRandom.setText(it).toString()
        })


    }
}