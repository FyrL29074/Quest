package com.fyrl29074.feature_projects.presentation

import AppRoutes
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fyrl29074.feature_projects.databinding.FragmentProjectsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProjectsFragment : Fragment() {

    private val viewModel: ProjectsViewModel by viewModel()

    private var _binding: FragmentProjectsBinding? = null
    private val binding get() = _binding!!

    private val navController by lazy {
        findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProjectsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun ProjectsFragment.initUI() {
        binding.navigate.setOnClickListener {
            navController.navigate(AppRoutes.FeatureTasks.Entry)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
