package rodriguez.enrique.practica5_00000246966

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_get_started)

        button.setOnClickListener{
            var intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}