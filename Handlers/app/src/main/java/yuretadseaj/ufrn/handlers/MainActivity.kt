package yuretadseaj.ufrn.handlers

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.os.Handler
import android.widget.ImageView
import java.io.IOException
import java.net.URL

class MainActivity : AppCompatActivity() {

    private val messageCode = 26
    lateinit var messenger: MyHandler
    private var bitMap: Bitmap? = null
    private var imgView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        messenger = MyHandler()
        imgView = findViewById(R.id.imageView)

    }
    @SuppressLint("HandlerLeak")
    inner class MyHandler : Handler() {
        override fun handleMessage(msg: Message) {
            when (msg.what) {
                messageCode -> {
                    Thread {
                        bitMap = loadImageFromNetwork("https://images.uncyc.org/pt/c/c6/Geraltvidaloka.jpg")
                    }.start()
                    imgView?.setImageBitmap(bitMap)
                }
            }
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
