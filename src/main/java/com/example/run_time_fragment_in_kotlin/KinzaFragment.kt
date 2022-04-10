package com.example.run_time_fragment_in_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class KinzaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_kinza, container, false)

        var goToRabiaFragmentButton = view.findViewById<Button>(R.id.go_to_rabia_fragment_button)

        goToRabiaFragmentButton.setOnClickListener {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.container_layout, RabiaFragment(), null)
                .addToBackStack(null).commit()
        }

        return view
    }

}