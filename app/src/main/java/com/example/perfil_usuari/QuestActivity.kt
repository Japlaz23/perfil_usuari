package com.example.perfil_usuari

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class QuestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quest)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val descriptionInput = findViewById<EditText>(R.id.descInput)
        val imageInput = findViewById<EditText>(R.id.imgInput)

        findViewById<Button>(R.id.enviarbtn).setOnClickListener {
            val sigPantalla = Intent(this, ResultActivity::class.java).apply {
                putExtra(ResultActivity.EXTRA_NAME, nameInput.text.toString().trim())
                putExtra(ResultActivity.EXTRA_EMAIL, emailInput.text.toString().trim())
                putExtra(
                    ResultActivity.EXTRA_DESCRIPTION,
                    descriptionInput.text.toString().trim()
                )
                putExtra(ResultActivity.EXTRA_IMAGE_URL, imageInput.text.toString().trim())
            }
            startActivity(sigPantalla)
        }
    }
}