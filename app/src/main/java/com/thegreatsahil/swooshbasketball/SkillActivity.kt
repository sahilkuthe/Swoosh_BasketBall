package com.thegreatsahil.swooshbasketball

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.thegreatsahil.swooshbasketball.Model.Player
import com.thegreatsahil.swooshbasketball.databinding.ActivitySkillBinding
import com.thegreatsahil.swooshbasketball.utilities.EXTRA_PLAYER

//private lateinit var binding : ActivitySkillBinding

class SkillActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySkillBinding
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        player = if(Build.VERSION.SDK_INT>=33){
//            intent.getParcelableExtra(EXTRA_PLAYER, Player::class.java)
//        }else{
//            intent.getParcelableExtra(EXTRA_PLAYER)
//        }?: Player("", "")

        player = intent.getParcelableExtra(EXTRA_PLAYER)?: Player("", "")

    }

    fun beginnerBtnClicked(view: View){
        binding.ballerBtn.isChecked = false
        player.skill = "beginner"

    }

    fun ballerBtnClicked(view: View){
        binding.beginnerBtn.isChecked = false
        player.skill = "baller"

    }

    fun finishBtnClicked(view: View){
        if(player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)

        }else{
            Toast.makeText(this, "Please select a skill!", Toast.LENGTH_SHORT).show()
        }
    }


}