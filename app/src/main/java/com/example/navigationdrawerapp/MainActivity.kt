package com.example.navigationdrawerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layoutView)
        val navView =findViewById<NavigationView>(R.id.navigationView)

        toggle=ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home-> Toast.makeText(this,"Clicked Home",Toast.LENGTH_SHORT).show()
                R.id.menu_call-> Toast.makeText(this,"Clicked Call",Toast.LENGTH_SHORT).show()
                R.id.menu_event-> Toast.makeText(this,"Clicked Event",Toast.LENGTH_SHORT).show()
                R.id.menu_settings-> Toast.makeText(this,"Clicked Settings",Toast.LENGTH_SHORT).show()
                R.id.menu_login-> Toast.makeText(this,"Clicked Login",Toast.LENGTH_SHORT).show()
                R.id.menu_share-> Toast.makeText(this,"Clicked Share",Toast.LENGTH_SHORT).show()
                R.id.menu_location-> Toast.makeText(this,"Clicked Location",Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)

        if(toggle.onOptionsItemSelected(item)){
            return true
        }

    }
}