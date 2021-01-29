package yuretadseaj.ufrn.handlers

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.io.IOException
import java.net.URL

class MainActivity : AppCompatActivity() {

    lateinit var handler: Handler
    private var bitMap: Bitmap? = null
    private var imgView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler()
        imgView = findViewById(R.id.imageView)
        findViewById<Button>(R.id.btnDownload).setOnClickListener { click() }
    }

    private fun click() {
        handler.post {
            Toast.makeText(this, "A mensagem chegou", Toast.LENGTH_SHORT).show()
            Thread {
                bitMap = loadImageFromNetwork("https://images.uncyc.org/pt/c/c6/Geraltvidaloka.jpg")
            }.start()
            imgView?.setImageBitmap(bitMap)
        }
    }

    @Throws(IOException::class)
    fun loadImageFromNetwork(url: String): Bitmap? {
        var bitmap: Bitmap? = null
        val stream = URL(url).openStream()
        bitmap = BitmapFactory.decodeStream(stream)
        stream.close()
        return bitmap
    }
}
