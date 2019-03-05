package io.svechnikov.mvvmtemplate.features.entry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import io.svechnikov.mvvmtemplate.core.di.Injectable
import io.svechnikov.mvvmtemplate.core.di.modules.ViewModelFactory
import io.svechnikov.mvvmtemplate.databinding.FragmentEntryBinding
import javax.inject.Inject

class EntryFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var viewModel: EntryViewModel

    lateinit var binding: FragmentEntryBinding

    fun navController() = findNavController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(
            this, viewModelFactory)[EntryViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentEntryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.state.observe(viewLifecycleOwner, Observer {
            when(it) {
                EntryState.Loading -> {

                }
            }
        })
    }
}