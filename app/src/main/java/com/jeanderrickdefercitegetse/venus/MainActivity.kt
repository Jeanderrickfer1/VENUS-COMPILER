package com.jeanderrickdefercitegetse.venus

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#0F172A"))
            setPadding(50, 50, 50, 50)
        }

        val title = TextView(this).apply {
            text = "🪐 Venus Compiler fonctionne !"
            textSize = 24f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "Tester le clic"
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Compilation réussie à 100% !", Toast.LENGTH_LONG).show()
            }
        }

        layout.addView(title)
        layout.addView(button)
        setContentView(layout)
    }
}
