package yuretadseaj.ufrn.loginapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton: Button  = findViewById(R.id.buttonLogin)

        loginButton.setOnClickListener {
            val message: TextView = findViewById(R.id.login_message)
            val password = findViewById<EditText>(R.id.passwordInput).text.toString()
            val email = findViewById<EditText>(R.id.emailInput).text.toString()

            if (validateLogin(password, email)) {
                message.text = "Usuário Logado"
                message.setTextColor(Color.BLACK)
            } else {
                message.text = "Senha inválida"
                message.setTextColor(Color.RED)
            }
        }
    }
}

fun validateLogin(password: String, email: String): Boolean {
    return password == "senha12345" && email == "yure@gmail.com"
}