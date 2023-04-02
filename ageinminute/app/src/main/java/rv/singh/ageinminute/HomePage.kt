package rv.singh.ageinminute

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val HardWareBtn = findViewById<ImageButton>(R.id.HardWareBtn)
        HardWareBtn.setOnClickListener {
            val Intent = Intent(this, Hardware::class.java)
            startActivity(Intent)
        }
        val FaqBtn = findViewById<ImageButton>(R.id.FaqBtn)
        FaqBtn.setOnClickListener {
            val Intent = Intent(this, Faq::class.java)
            startActivity(Intent)
        }

        val MyCropBtn = findViewById<ImageButton>(R.id.MyCropBtn)
        MyCropBtn.setOnClickListener {
            val Intent = Intent(this, MyCrops::class.java)
            startActivity(Intent)
        }

        val KrishiBtn = findViewById<ImageButton>(R.id.KrishiBtn)
        KrishiBtn.setOnClickListener {
            val Intent = Intent(this, KrishiGyan::class.java)
            startActivity(Intent)
        }
    }

    fun btnHomeOnClick(view: View) {
        Toast.makeText(this, "You are already on HomePage ", Toast.LENGTH_SHORT).show()
    }
}
