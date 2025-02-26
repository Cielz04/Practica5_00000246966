package rodriguez.enrique.practica5_00000246966

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.btnAntojitos) as Button
        var btnEspecialidades: Button = findViewById(R.id.btnEspecialidades) as Button
        var btnDrinks: Button = findViewById(R.id.btnDrinks) as Button
        var btnCombinations : Button = findViewById(R.id.btnCombinations) as Button
        var btnTortas : Button = findViewById(R.id.btnTortas) as Button
        var btnSopas : Button = findViewById(R.id.btnSopas) as Button

        btnSopas.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)
        }

        btnTortas.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)
        }

        btnCombinations.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Combinations")
            startActivity(intent)
        }

        btnDrinks.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Drinks")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }

        btnAntojitos.setOnClickListener{

            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }
    }
}