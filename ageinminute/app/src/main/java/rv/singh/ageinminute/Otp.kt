package rv.singh.ageinminute

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Otp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val OSubmitButton = findViewById<Button>(R.id.OSubmitButton)
        OSubmitButton.setOnClickListener {
            val Intent = Intent(this, HomePage::class.java)
            startActivity(Intent)
        }
    }
}