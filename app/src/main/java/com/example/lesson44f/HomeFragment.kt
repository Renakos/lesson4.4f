package com.example.lesson44f

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson44f.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    private var data = mutableListOf<ItemModel>()
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val adapter = Adapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rv.adapter = adapter


        setData()
    }

    private fun setData() {
        var number = 0
        adapter.setData(
            listOf(
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),
                ItemModel(
                    getString(R.string.n2d),
                    getString(R.string.work)
                ),



                )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}