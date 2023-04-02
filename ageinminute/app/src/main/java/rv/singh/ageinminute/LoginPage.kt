package rv.singh.ageinminute

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val SubmitButton = findViewById<Button>(R.id.OSubmitButton)
        SubmitButton.setOnClickListener{
            val Intent = Intent(this,Otp::class.java)
            startActivity(Intent)
        }

    }
}