package com.example.fr.swoosh.Controller

// import android.support.v7.app.AppCompatActivity
import android.annotation.SuppressLint
import android.os.Bundle
import com.example.fr.swoosh.R
import com.example.fr.swoosh.Utilities.EXTRA_LEAGUE
import com.example.fr.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchingLeaguesText.text = "Looking for a $league $skill league near you..."
    }
}
