package com.thegreatsahil.swooshbasketball

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.thegreatsahil.swooshbasketball.Model.Player
import com.thegreatsahil.swooshbasketball.databinding.ActivityLeagueBinding
import com.thegreatsahil.swooshbasketball.utilities.EXTRA_PLAYER


private lateinit var binding: ActivityLeagueBinding
class LeagueActivity : BaseActivity() {

    var player = Player(league = "", skill = "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun mensBtnClicked(view: View){
        binding.womensBtn.isChecked = false
        binding.coBtn.isChecked = false
        player.league = "mens"
    }

    fun womensBtnClicked(view: View){
        binding.mensBtn.isChecked = false
        binding.coBtn.isChecked = false
        player.league = "womens"

    }

    fun coBtnClicked(view: View){
        binding.mensBtn.isChecked = false
        binding.womensBtn.isChecked = false
        player.league = "co-ed"

    }

    fun nextBtnClicked(view: View){
        if(player.league!= ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}