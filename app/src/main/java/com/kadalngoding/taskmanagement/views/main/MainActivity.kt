package com.kadalngoding.taskmanagement.views.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.kadalngoding.taskmanagement.R
import com.kadalngoding.taskmanagement.views.complate.ComplateFragment
import com.kadalngoding.taskmanagement.views.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        btmNavMain.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.action_home ->{
                    openFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_complate ->{
                    openFragment(ComplateFragment())
                        return@setOnNavigationItemSelectedListener true

                }
            }
            return@setOnNavigationItemSelectedListener false
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_main, fragment)
            .addToBackStack(null)
            .commit()

    }

//    private fun setupBottomNavigation() {
////        .setOnNavigationItemSelectedListener{
////
////        }
//        btnNav
//
//    }
}