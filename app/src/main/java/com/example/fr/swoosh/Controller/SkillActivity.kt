package com.example.fr.swoosh.Controller

// import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import com.example.fr.swoosh.Model.Player
import com.example.fr.swoosh.R
import com.example.fr.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClicked(view: View) {
        player.skill = "beginner"
        beginnerSkillBtn.isChecked = true
        ballerSkillBtn.isChecked = false
    }

    fun onBallerClicked(view: View) {
        player.skill = "baller"
        ballerSkillBtn.isChecked = true
        beginnerSkillBtn.isChecked = false
    }

    fun onSkillFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please, select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
