package yuretadseaj.ufrn.salvandoestado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import yuretadseaj.ufrn.salvandoestado.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.i("Mensagem", "onSaveInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Mensagem", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Mensagem", "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Mensagem", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Mensagem", "onDestroy")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Mensagem", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Mensagem", "onRestart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("Mensagem", "onRestoreInstanceState")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            buttonChangeMessage.setOnClickListener {
                message.text = editMessageTextView.text
            }
        }

        Log.i("Mensagem", "onCreate")
    }
}