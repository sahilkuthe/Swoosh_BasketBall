package com.thegreatsahil.swooshbasketball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thegreatsahil.swooshbasketball.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.getStartedBtn.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }



}