package com.example.run_time_fragment_in_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class RabiaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_rabia, container, false)

        var goToTehreenFragmentButton:Button = view.findViewById(R.id.go_to_tehreen_fragment_button)

        goToTehreenFragmentButton.setOnClickListener {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.container_layout, TehreenFragment(), null)
                .addToBackStack(null).commit()
        }



        return view
    }

}