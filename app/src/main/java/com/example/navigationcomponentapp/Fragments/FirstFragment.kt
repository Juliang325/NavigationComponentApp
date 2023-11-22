package com.example.navigationcomponentapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentapp.R


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =inflater.inflate(R.layout.fragment_first, container, false)

        val btnNavFirst = root.findViewById<Button>(R.id.btnNavFirst)

        btnNavFirst.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                name = "Mi primera nav con parametro"
            ))
        }

        return root
    }

}