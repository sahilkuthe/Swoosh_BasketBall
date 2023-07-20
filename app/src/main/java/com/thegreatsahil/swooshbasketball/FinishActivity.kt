package com.thegreatsahil.swooshbasketball

import android.os.Bundle
import com.thegreatsahil.swooshbasketball.databinding.ActivityFinishBinding
import com.thegreatsahil.swooshbasketball.utilities.EXTRA_LEAGUE
import com.thegreatsahil.swooshbasketball.utilities.EXTRA_SKILL


private lateinit var binding : ActivityFinishBinding

class FinishActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent = intent
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        binding.finalText.text = "Looking for a $league  $skill  league near you..."




    }



}