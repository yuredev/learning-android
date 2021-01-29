package yuretadseaj.ufrn.navegacao

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScreenC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_c)

        findViewById<Button>(R.id.backButtonScreenC).setOnClickListener {
//          retornando parametros para tela anterior
            val intent = Intent()
            intent.putExtra("Retorno", "Essa mensagem vem da Tela C")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}