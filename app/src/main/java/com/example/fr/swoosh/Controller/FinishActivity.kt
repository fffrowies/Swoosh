package com.example.fr.swoosh.Controller

// import android.support.v7.app.AppCompatActivity
import android.annotation.SuppressLint
import android.os.Bundle
import com.example.fr.swoosh.Model.Player
import com.example.fr.swoosh.R
import com.example.fr.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchingLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
