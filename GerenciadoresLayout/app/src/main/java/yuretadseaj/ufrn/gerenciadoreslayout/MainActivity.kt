package yuretadseaj.ufrn.gerenciadoreslayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import yuretadseaj.ufrn.gerenciadoreslayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnSearch.setOnClickListener {
            binding.btnSearch.visibility = View.GONE
            binding.progressBar.visibility = View.VISIBLE
        }
    }
}