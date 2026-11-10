package ro.pub.cs.systems.eim.practicaltest01var03

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var03SecondaryActivity : AppCompatActivity() {
    private lateinit var textResult: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var03_secondary)
        textResult = findViewById<EditText>(R.id.editTextRes)
        val okButton = findViewById<Button>(R.id.okButton)
        val cancelButton = findViewById<Button>(R.id.cancelButton)


        val intent = intent
        textResult.setText(intent.getStringExtra("textResult"))


        okButton.setOnClickListener {
            setResult(RESULT_OK, Intent())
            finish()
        }

        cancelButton.setOnClickListener {
            setResult(RESULT_CANCELED, Intent())
            finish()
        }
    }
}
