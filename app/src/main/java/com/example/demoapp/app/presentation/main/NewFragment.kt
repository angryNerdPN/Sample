package com.example.demoapp.app.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.demoapp.R
import com.example.demoapp.core.livedata.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewFragment : Fragment(R.layout.fragment_new) {

    private val viewModel: NewViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getUsers()

        viewModel.users.observe(viewLifecycleOwner) { resource ->
            when (resource) {
                is Resource.Loading -> Unit // Loading indicator
                is Resource.Success -> {
                    Toast.makeText(requireContext(), resource.data.toString(), Toast.LENGTH_LONG)
                        .show()
                }
                is Resource.Error -> {
                    Toast.makeText(requireContext(), resource.error.localizedMessage, Toast.LENGTH_LONG).show()
                }
            }
        }
    }

}