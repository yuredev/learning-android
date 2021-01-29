package yuretadseaj.ufrn.navegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class ScreenB : AppCompatActivity() {

    override fun onPause() {
        Log.i("Mensagem", "onPause chamado")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Mensagem", "onStop chamado")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Mensagem", "onDestroy chamado")
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_b)
        val params = intent.extras
        val texto = if (params != null) params.getString("texto") else "sem parametro texto"
        findViewById<TextView>(R.id.screenBMessage).text = texto

        findViewById<Button>(R.id.backButtonScreenB).setOnClickListener {
            finish()
        }
    }
}