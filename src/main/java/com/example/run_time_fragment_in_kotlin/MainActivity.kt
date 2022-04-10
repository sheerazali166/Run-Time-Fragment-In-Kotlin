package com.example.run_time_fragment_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

   companion object{

      lateinit var fragmentManager:FragmentManager
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (findViewById<FrameLayout>(R.id.container_layout) != null){

            if(savedInstanceState != null){

                return
            }

           MainActivity.fragmentManager = supportFragmentManager

           var fragmentTransaction:FragmentTransaction = MainActivity.fragmentManager.beginTransaction()

            var kinzaFragment:KinzaFragment = KinzaFragment()

            fragmentTransaction.add(R.id.container_layout, kinzaFragment, null)

            fragmentTransaction.commit()

        }
    }
}