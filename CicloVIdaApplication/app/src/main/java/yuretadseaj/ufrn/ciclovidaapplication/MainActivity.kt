package yuretadseaj.ufrn.ciclovidaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("AulaCicloVida", "método onCreate Invocado")
        setContentView(R.layout.activity_main)
        val finishButton = findViewById<Button>(R.id.finish_button)

        finishButton.setOnClickListener {
//            destroi a activity
//            chamará os métodos nesta ordem...
//            onPause
//            onStop
//            onDestroy
            finish()
        }
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.i("AulaCicloVida", "método onStart Invocado")

        super.onStart()
    }

    override fun onResume() {
        Log.i("AulaCicloVida", "método onResume Invocado")
        super.onResume()
    }

    override fun onPause() {
        Log.i("AulaCicloVida", "método onPause Invocado")
        super.onPause()
    }

    override fun onRestart() {
        Log.i("AulaCicloVida", "método onRestart Invocado")
        super.onRestart()
    }

    override fun onStop() {
        Log.i("AulaCicloVida", "método onStop Invocado")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("AulaCicloVida", "método onDestroy Invocado")
        super.onDestroy()
    }


}