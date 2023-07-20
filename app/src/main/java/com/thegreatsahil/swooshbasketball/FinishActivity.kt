package com.thegreatsahil.swooshbasketball

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thegreatsahil.swooshbasketball.Model.Player
import com.thegreatsahil.swooshbasketball.databinding.ActivityFinishBinding
import com.thegreatsahil.swooshbasketball.utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity(){

    private lateinit var binding: ActivityFinishBinding
    private lateinit var player: Player // Use class-level property for player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        player = if (Build.VERSION.SDK_INT >= 33) {
//            intent.getParcelableExtra(EXTRA_PLAYER, Player::class.java)
//        } else {
//            intent.getParcelableExtra(EXTRA_PLAYER)
//        }
        player = intent.getParcelableExtra(EXTRA_PLAYER)?: Player("", "")


        // Make sure to check if player is not null before using it to avoid NullPointerException
        player?.let {
            binding.finalText.text = "Looking for a ${it.league} ${it.skill} league near you..."
        }
    }
}
