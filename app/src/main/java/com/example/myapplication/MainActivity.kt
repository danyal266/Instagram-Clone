package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapplication.ui.home.HomeFragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.Search.SearchFragment
import com.example.myapplication.ui.heart.heartFragment
import com.example.myapplication.ui.plus.plusFragment
import com.example.myapplication.ui.profile.ProfileFragment

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val homeFragment = HomeFragment()
         val search = SearchFragment()
        val plus = plusFragment()
        val profile = ProfileFragment()
        val heartFragment = heartFragment()
        makeCurrentFragment(homeFragment)
        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

//
        navView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home-> makeCurrentFragment(homeFragment)
                R.id.plus_navigation-> makeCurrentFragment(plus)
                R.id.heart_navigation-> makeCurrentFragment(heartFragment)
                R.id.search_navigation-> makeCurrentFragment(search)
                R.id.profile_navigation->makeCurrentFragment(profile)

            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.nav_host_fragment_activity_main,fragment)
        commit()
    }


}




