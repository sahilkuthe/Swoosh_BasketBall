package com.thegreatsahil.swooshbasketball

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.thegreatsahil.swooshbasketball.databinding.ActivitySkillBinding
import com.thegreatsahil.swooshbasketball.utilities.EXTRA_LEAGUE
import com.thegreatsahil.swooshbasketball.utilities.EXTRA_SKILL

private lateinit var binding : ActivitySkillBinding

class SkillActivity : BaseActivity() {

    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent;
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)

    }

    fun beginnerBtnClicked(view: View){
        binding.ballerBtn.isChecked = false
        skill = "beginner"

    }

    fun ballerBtnClicked(view: View){
        binding.beginnerBtn.isChecked = false
        skill = "baller"

    }

    fun finishBtnClicked(view: View){
        if(skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            val league = intent.getStringExtra(EXTRA_LEAGUE)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishActivity)

        }else{
            Toast.makeText(this, "Please select a skill!", Toast.LENGTH_SHORT).show()
        }
    }















}