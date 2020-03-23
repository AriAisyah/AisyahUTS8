package com.aisyah.aisyahuts8

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.aisyah.aisyahuts8.ui.gallery.GalleryFragment
import com.aisyah.aisyahuts8.ui.home.HomeFragment
import com.aisyah.aisyahuts8.ui.slideshow.SlideshowFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_skincare1,
                R.id.nav_bodycare2,
                R.id.nav_makeup3,
                R.id.nav_profile4
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.nav_skincare1 -> {
                val cf = GalleryFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, cf).commit()
                supportFragmentManager.popBackStack()
                toolbar.title = "Skincare"
                Toast.makeText(this, "Skincare", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_bodycare2 -> {
                val cf = HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, cf).commit()
                supportFragmentManager.popBackStack()
                toolbar.title = "Bodycare"
                Toast.makeText(this, "Bodycare", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_makeup3 -> {
                val cf = SlideshowFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, cf).commit()
                supportFragmentManager.popBackStack()
                toolbar.title = "Makeup"
                Toast.makeText(this, "Makeup", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_profile4 -> {
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
