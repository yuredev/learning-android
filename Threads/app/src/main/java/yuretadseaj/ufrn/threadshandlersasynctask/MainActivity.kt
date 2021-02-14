package yuretadseaj.ufrn.threadshandlersasynctask

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import yuretadseaj.ufrn.threadshandlersasynctask.databinding.ActivityMainBinding
import java.io.IOException
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDownloadImage.setOnClickListener {
            Thread {
                val url = "https://images.uncyc.org/pt/c/c6/Geraltvidaloka.jpg"
                val imageBitMap = loadImageFromNetwork(url)
                runOnUiThread {
                    binding.imageView.setImageBitmap(imageBitMap)
                }
//                o código abaixo faria a mesma coisa
//                binding.imageView.post {
//                    binding.imageView.setImageBitmap(imageBitMap)
//                }
//                faria a mesma coisa mas com um atraso de 5000 milisegundos
//                binding.imageView.postDelayed({
//                    binding.imageView.setImageBitmap(imageBitMap)
//                }, 5000)
            }.start()
        }
    }

    @Throws(IOException::class)
    fun loadImageFromNetwork(url: String): Bitmap? {
        var bitmap: Bitmap? = null
        val stream = URL(url).openStream()
//        converte InputStream do Java para Bitmap
        bitmap = BitmapFactory.decodeStream(stream)
        stream.close()
        return bitmap
    }
}