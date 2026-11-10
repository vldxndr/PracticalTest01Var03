package ro.pub.cs.systems.eim.practicaltest01var03

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var03MainActivity : AppCompatActivity() {

    private lateinit var textResult: EditText
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var03_main)
        editText1 = findViewById<EditText>(R.id.editText1)
        editText2 = findViewById<EditText>(R.id.editText2)
        val buttonPlus = findViewById<Button>(R.id.buttonPlus)
        val buttonMinus = findViewById<Button>(R.id.buttonMinus)
        textResult = findViewById<EditText>(R.id.editTextResult)

        buttonPlus.setOnClickListener {
            if (editText1.text.isNotEmpty() && editText2.text.isNotEmpty()) {
                val sum = editText1.text.toString().toInt() + editText2.text.toString().toInt()
                textResult.setText("${editText1.text} + ${editText2.text} = $sum")

            } else {
                Toast.makeText(this, "Please enter numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}