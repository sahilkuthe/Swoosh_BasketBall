package com.thegreatsahil.swooshbasketball

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.thegreatsahil.swooshbasketball.databinding.ActivityLeagueBinding
import com.thegreatsahil.swooshbasketball.utilities.EXTRA_LEAGUE

private lateinit var binding: ActivityLeagueBinding
class LeagueActivity : BaseActivity() {

    var leagueBtn = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun mensBtnClicked(view: View){
        binding.womensBtn.isChecked = false
        binding.coBtn.isChecked = false
        leagueBtn = "mens"
    }

    fun womensBtnClicked(view: View){
        binding.mensBtn.isChecked = false
        binding.coBtn.isChecked = false
        leagueBtn = "womens"

    }

    fun coBtnClicked(view: View){
        binding.mensBtn.isChecked = false
        binding.womensBtn.isChecked = false
        leagueBtn = "co-ed"

    }

    fun nextBtnClicked(view: View){
        if(leagueBtn!= ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, leagueBtn)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}